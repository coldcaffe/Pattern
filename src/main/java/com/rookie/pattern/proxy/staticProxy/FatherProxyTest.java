package com.rookie.pattern.proxy.staticProxy;

public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
