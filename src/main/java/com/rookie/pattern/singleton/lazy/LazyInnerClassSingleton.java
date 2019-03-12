package com.rookie.pattern.singleton.lazy;

/**
 * 静态内部类方式单例(基于内部类执行逻辑)
 * 全程未使用synchronized关键字,可以说是性能最优的实现方案
 */
public class LazyInnerClassSingleton {

    /**
     * 虽然构造方法已经私有,但不排除存在反射攻击(调用者通过反射调用)的情况导致单例失效
     * 所以针对反射调用直接抛异常禁止调用者违规操作
     */
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    /**
     * 懒汉式单例
     * LazyHolder里面的逻辑需要等到外部方法调用时才执行(巧妙利用了内部类的特性)
     * 基于JVM底层执行逻辑,可以完美避免线程安全问题
     */
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
