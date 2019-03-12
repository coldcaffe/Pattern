package com.rookie.pattern.singleton.hungry;

/**
 * 饿汉式单例模式(通过静态代码块加载)
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungurySingleton;

    static {
        hungurySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungurySingleton;
    }
}
