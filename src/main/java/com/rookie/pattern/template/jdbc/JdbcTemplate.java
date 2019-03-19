package com.rookie.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eric
 * @Date: 2019/3/18 23:25
 * @Version 1.0
 */
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement ps = this.createPreparedStatement(conn, sql);
            //3.执行语句集
            ResultSet rs = this.executeQuery(ps, values);
            //4.处理结果集
            List<?> result = this.parseResult(rs, rowMapper);
            //5.关闭结果集
            this.closeResult(rs);
            //6.关闭语句集
            this.closeStatement(ps);
            //7.关闭连接
            this.closeConnection(conn);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void closeConnection(Connection conn) throws Exception {
        //回收至数据库连接池
        conn.close();
    }

    protected void closeStatement(PreparedStatement ps) throws Exception {
        ps.close();
    }

    protected void closeResult(ResultSet rs) throws Exception {
        rs.close();
    }

    protected List<?> parseResult(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement ps, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            ps.setObject(i, values[i]);
        }
        return ps.executeQuery();
    }

    protected PreparedStatement createPreparedStatement(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);
    }

    protected Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
