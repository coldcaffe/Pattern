package com.rookie.pattern.test.singleton;

import com.rookie.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 模拟反射攻击场景,观察内部类方式单例在反射调用构造方法的场景下是否还能保证单例
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            // 暴力反射解除方法私有状态
            c.setAccessible(true);

            Object o1 = c.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
