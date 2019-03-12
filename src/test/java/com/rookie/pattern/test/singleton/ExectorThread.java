package com.rookie.pattern.test.singleton;

import com.rookie.pattern.singleton.threadLocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        //LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + instance);
    }
}
