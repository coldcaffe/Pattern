package com.rookie.pattern.template.course;

/**
 * @Author: Eric
 * @Date: 2019/3/18 23:13
 * @Version 1.0
 */
public class JavaCourse extends NetWorkCourse {

    @Override
    protected void checkHomeWork() {
        System.out.println("检查Java课程的作业");
    }
}
