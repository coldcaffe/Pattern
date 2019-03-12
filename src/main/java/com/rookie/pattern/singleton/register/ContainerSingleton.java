package com.rookie.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例(容器式) -- 基于Spring容器(也是spring ioc实现原理)
 * 1.对象管理方便,本质上也属于懒加载
 * 2.ConcurrentHashMap只保证其内部线程安全,而getBean方法中如不加synchronized则不能保证线程安全(虽然会损失一部分性能)
 */
public class ContainerSingleton {

    public ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }
}
