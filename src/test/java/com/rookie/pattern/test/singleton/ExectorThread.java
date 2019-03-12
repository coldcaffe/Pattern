package com.rookie.pattern.test.singleton;

import com.rookie.pattern.singleton.lazy.LazyDoubleCheckSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        //LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + instance);
    }
}
