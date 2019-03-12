package com.rookie.pattern.singleton.threadLocal;

/**
 * 伪单例,只能保证线程内部的全局唯一,且天生线程安全(本质上还是属于容器式单例)
 * 可以使用ThreadLocal实现orm框架中多数据源的动态切换(数据源路由)
 * ThreadLocalMap以线程本身为key,对象为value
 */
public class ThreadLocalSingleton {

    public ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL_INSTANCE.get();
    }
}
