package com.rookie.pattern.template.course;

/**
 * 简单模板模式的测试(及钩子方法验证)
 *
 * @Author: Eric
 * @Date: 2019/3/18 23:18
 * @Version 1.0
 */
public class NetWorkCourseTest {

    public static void main(String[] args) {
        System.out.println("---------Java架构课程----------");
        NetWorkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("---------大数据课程----------");
        NetWorkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
