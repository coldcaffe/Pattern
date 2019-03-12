package com.rookie.pattern.test.singleton;

/**
 * 用于演示在多线程情境下同步与非同步懒汉式的安全性
 * (非同步情景若多个线程同时进入会创建多次,演示时需注意分别打印,防止后一个线程对之前线程执行地址值的覆盖)
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());

        thread1.start();
        thread2.start();

        System.out.println("Thread End!");
    }
}
