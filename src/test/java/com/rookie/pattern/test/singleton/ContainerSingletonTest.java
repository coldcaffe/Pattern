package com.rookie.pattern.test.singleton;

import com.rookie.pattern.singleton.register.ContainerSingleton;

/**
 * 模拟容器创建对象(后续需引入发令枪代码进行多线程并发测试)
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        Object bean = ContainerSingleton.getBean("com.rookie.pattern.test.singleton.ExectorThread");
        System.out.println(bean);
    }
}
