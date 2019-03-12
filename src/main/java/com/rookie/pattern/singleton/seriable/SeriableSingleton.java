package com.rookie.pattern.singleton.seriable;

public class SeriableSingleton {

    public static final SeriableSingleton SINGLETON = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return SINGLETON;
    }

    /**
     * 通过实现readResolve方法可以在序列化执行时反射调用,从而保证单例实现
     * 但是需要明确的是重写readResolve()只是覆盖了序列化出的对象,实际还是创建了两次对象,发生在JVM层面,相对安全(之前反序列化对象会GC回收)
     */
    private Object readResolve() {
        return SINGLETON;
    }
}
