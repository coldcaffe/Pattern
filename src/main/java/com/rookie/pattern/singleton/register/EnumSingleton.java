package com.rookie.pattern.singleton.register;

/**
 * 注册式单例(枚举式) -- 推荐使用
 * 通过jad工具反编译对应.class文件可看到代码已转为饿汉式实现从而保证了单例线程安全(序列化时由于根据会根据类名及字段名获取
 * Jvm中变量值从而防止了序列化的破坏)
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
