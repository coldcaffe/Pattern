package com.rookie.pattern.singleton.hungry;

/**
 * 饿汉式单例模式(不管是否调用都先初始化,在未使用对象过多情境下较为浪费内存资源)
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
