package com.rookie.pattern.test.singleton;

import com.rookie.pattern.singleton.threadLocal.ThreadLocalSingleton;

/**
 * 演示ThreadLocal在同一线程下保证单例,同时启动不同线程时不能保证的伪单例场景
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        //main方法主线程下对象地址一致
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        //同时执行的线程0,1对象地址值不能保持一致
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();

        System.out.println("END");
    }
}
