package com.rookie.pattern.template.jdbc.dao;

import com.rookie.pattern.template.jdbc.JdbcTemplate;
import com.rookie.pattern.template.jdbc.Member;
import com.rookie.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @Author: Eric
 * @Date: 2019/3/18 23:47
 * @Version 1.0
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                //如果字段过多可以穿插使用原型模式实现字段内容复制
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        }, null);
    }
}
