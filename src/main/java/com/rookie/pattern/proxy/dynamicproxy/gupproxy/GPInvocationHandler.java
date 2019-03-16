package com.rookie.pattern.proxy.dynamicproxy.gupproxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {
    public Object invoke(Object prxoy, Method method, Object[] args) throws Throwable;
}
