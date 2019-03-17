package com.rookie.pattern.delegate.simple;

/**
 * @Author: Eric
 * @Date: 2019/3/17 18:08
 * @Version 1.0
 */
public class EmployeeB implements IEmployee {
    //B员工擅长登录
    public void doing(String command) {
        System.out.println("我是员工B,现在开始做"+command+"工作");
    }
}
