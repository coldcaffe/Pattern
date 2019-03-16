package com.rookie.pattern.proxy.dynamicproxy.jdkproxy;

import com.rookie.pattern.proxy.staticProxy.Person;

public class Girl implements Person {

    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("有6块腹肌");
    }
}
