package com.rookie.pattern.adapter.loginAdapter.v1.service;

import com.rookie.pattern.adapter.loginAdapter.ResultMsg;

/**
 * @Author: Eric
 * @Date: 2019/3/19 22:17
 * @Version 1.0
 */
public class SinginForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId) {
        //1.openId是全局唯一,我们可以把它当做是一个用户名
        //2.注册密码默认为QQ_EMPTY
        //3.注册
        //4.调用原来的登录方法
        return loginForRegist(openId, null);
    }

    private ResultMsg loginForRegist(String username, String password) {
        super.regist(username, password);
        return super.login(username, null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String openId) {
        //通过token拿到用户信息,然后再重新登录一次
        return null;
    }

    public ResultMsg loginForTelephone(String telephone, String code) {
        return null;
    }
}
