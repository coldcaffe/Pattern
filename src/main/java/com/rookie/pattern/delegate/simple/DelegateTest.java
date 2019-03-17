package com.rookie.pattern.delegate.simple;

/**
 * @Description: 测试简单的委派设计模式结构
 * @Author: Eric
 * @Date: 2019/3/17 18:11
 * @Version 1.0
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("加密", new Leader());
    }
}
