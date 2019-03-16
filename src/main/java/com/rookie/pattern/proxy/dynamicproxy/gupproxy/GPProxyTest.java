package com.rookie.pattern.proxy.dynamicproxy.gupproxy;

import com.rookie.pattern.proxy.dynamicproxy.jdkproxy.Girl;
import com.rookie.pattern.proxy.staticProxy.Person;

public class GPProxyTest {

    public static void main(String[] args) {
        Person obj = (Person) new GPMeiPo().getInstance(new Girl());
        obj.findLove();
    }
}
