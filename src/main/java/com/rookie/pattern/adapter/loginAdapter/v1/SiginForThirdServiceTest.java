package com.rookie.pattern.adapter.loginAdapter.v1;

import com.rookie.pattern.adapter.loginAdapter.v1.service.SinginForThirdService;

/**
 * @Author: Eric
 * @Date: 2019/3/19 21:06
 * @Version 1.0
 */
public class SiginForThirdServiceTest {

    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("zhangsan", "1234");
        service.loginForQQ("1231531");
        service.loginForWechat("aafasaf");
    }
}
