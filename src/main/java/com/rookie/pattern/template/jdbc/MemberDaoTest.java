package com.rookie.pattern.template.jdbc;

import com.rookie.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @Author: Eric
 * @Date: 2019/3/18 23:58
 * @Version 1.0
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        //没有可连接数据源,所以暂时用null代替
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
