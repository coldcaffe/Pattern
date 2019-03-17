package com.rookie.pattern.delegate.simple;

/**
 * @Author: Eric
 * @Date: 2019/3/17 18:08
 * @Version 1.0
 */
public class EmployeeA implements IEmployee {
    //A员工擅长加密
    public void doing(String command) {
        System.out.println("我是员工A,现在开始做"+command+"工作");
    }
}
