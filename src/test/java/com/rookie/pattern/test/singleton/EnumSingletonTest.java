package com.rookie.pattern.test.singleton;

import com.rookie.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * 演示从JDK层面就为枚举不被序列化和反射破坏来做保障
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        try {
            /**
             * 1.序列化方式演示(序列化中会通过enum方法根据类名和参数名到JVM中获取对应变量值)
             */

            /**
             * 2.反射方式展示(调用枚举类jad编译后构造器调用生成,发现无法通过反射进行枚举类的构造生成,自然不存在反射破坏的可能)
             */
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton singleton = (EnumSingleton) c.newInstance("gaoteng", 666);
            System.out.println(singleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
