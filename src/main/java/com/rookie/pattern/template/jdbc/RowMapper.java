package com.rookie.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * ORM映射定制化的接口
 *
 * @Author: Eric
 * @Date: 2019/3/18 23:21
 * @Version 1.0
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
