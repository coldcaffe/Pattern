package com.rookie.pattern.proxy.dynamicproxy.jdkproxy;

import com.rookie.pattern.proxy.staticProxy.Person;

public class JDKProxyTest {

    public static void main(String[] args) {
        Person obj = (Person) new JDKMeiPo().getInstance(new Girl());
        obj.findLove();
    }
}
