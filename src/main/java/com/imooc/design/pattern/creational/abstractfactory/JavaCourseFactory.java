package com.imooc.design.pattern.creational.abstractfactory;

/**
 * Created by dell on 2019/3/26.
 */
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
