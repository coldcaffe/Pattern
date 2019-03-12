package com.rookie.pattern.singleton.lazy;

/**
 * 懒汉式单例模式(双重检查锁方案)
 */
public class LazyDoubleCheckSingleton {

    /**
     * 添加volatile关键字使变量对内存可见,可用于解决指令重排序的问题
     */
    private volatile static LazyDoubleCheckSingleton LAZY = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 双重检查锁,不在方法上加锁可防止锁表,添加双重对象检查以防止对象重复创建保证安全
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (LAZY == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (LAZY == null) {
                    LAZY = new LazyDoubleCheckSingleton();
                }
            }
        }
        return LAZY;
    }
}

