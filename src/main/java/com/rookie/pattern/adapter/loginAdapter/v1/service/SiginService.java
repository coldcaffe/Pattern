package com.rookie.pattern.adapter.loginAdapter.v1.service;

import com.rookie.pattern.adapter.loginAdapter.Member;
import com.rookie.pattern.adapter.loginAdapter.ResultMsg;

/**
 * @Author: Eric
 * @Date: 2019/3/19 21:07
 * @Version 1.0
 */
public class SiginService {

    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /**
     * 登录的方法
     *
     * @return
     */
    public ResultMsg login(String username, String password) {
        return null;
    }
}
