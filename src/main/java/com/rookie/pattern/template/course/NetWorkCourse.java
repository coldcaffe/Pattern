package com.rookie.pattern.template.course;

/**
 * 模板会有一个或多个未实现方法,而且这几个未实现方法会有固定的执行顺序
 *
 * @Author: Eric
 * @Date: 2019/3/18 23:05
 * @Version 1.0
 */
public abstract class NetWorkCourse {
    protected final void createCourse() {
        //1.发布预习资料
        this.postPreResourse();
        //2.制作PPT课件
        this.createPPT();
        //3.在线直播
        this.liveVideo();
        //4.提交课件,课堂笔记
        this.postNote();
        //5.提交源码
        this.postSource();
        //6.布置作业,有些课没作业(完成),有些课有作业(检查作业)
        if (needHomeWork()) {
            checkHomeWork();
        }
    }

    protected abstract void checkHomeWork();

    //钩子方法,用于实现流程的微调
    protected boolean needHomeWork() {
        return false;
    }

    final void postSource() {
        System.out.println("提交源代码");
    }

    final void postNote() {
        System.out.println("提交课件和笔记");
    }

    final void liveVideo() {
        System.out.println("直播授课");
    }

    final void createPPT() {
        System.out.println("创建备课PPT");
    }

    final void postPreResourse() {
        System.out.println("分发预习资料");
    }
}
