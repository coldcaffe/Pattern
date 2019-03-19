package com.rookie.pattern.template.course;

/**
 * @Author: Eric
 * @Date: 2019/3/18 23:15
 * @Version 1.0
 */
public class BigDataCourse extends NetWorkCourse {

    private boolean needHomeWorkFlag = false;

    public BigDataCourse(boolean needHomeWorkFlag) {
        this.needHomeWorkFlag = needHomeWorkFlag;
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWorkFlag;
    }

    @Override
    protected void checkHomeWork() {
        System.out.println("检查大数据课程的作业");
    }
}
