package com.rookie.pattern.singleton.seriable;

public class SeriableSingleton {

    public static final SeriableSingleton SINGLETON = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return SINGLETON;
    }

    /**
     * 通过实现readResolve方法可以在序列化执行时反射调用,从而保证单例实现
     */
    private Object readResolve() {
        return SINGLETON;
    }
}
