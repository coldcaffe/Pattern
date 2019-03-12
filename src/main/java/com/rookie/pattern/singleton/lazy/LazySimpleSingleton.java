package com.rookie.pattern.singleton.lazy;

/**
 * 懒汉式单例模式(调用时才初始化)
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton LAZY = null;

    private LazySimpleSingleton() {
    }

    /**
     * 在初始化方法上加同步关键字可保证多线程下只能创建一个对象
     * (有一个线程进入执行RUNNING,其他线程状态都为MONITOR直到第一个进入的线程执行完毕)
     * 虽然1.6后有优化,但由于在方法上加锁可能会锁类,不可避免的存在一定的性能问题
     */
    public synchronized static LazySimpleSingleton getInstance() {
        if (LAZY == null) {
            LAZY = new LazySimpleSingleton();
        }
        return LAZY;
    }
}

