package com.rookie.pattern.proxy.dynamicproxy.jdkproxy;

import com.rookie.pattern.proxy.staticProxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk的代理实现
 */
public class JDKMeiPo implements InvocationHandler {

    private Person target;

    public Object getInstance(Person person) {
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("我是媒婆,我要给你找对象,现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("OK的话就准备办事吧");
    }
}
