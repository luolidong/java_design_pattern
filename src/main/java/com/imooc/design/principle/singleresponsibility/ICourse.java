package com.imooc.design.principle.singleresponsibility;

/**
 * Created by dell on 2019/3/25.
 * 这个接口有2个职责，1 获取课程相关信息 2 管理课程  可以拆
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
