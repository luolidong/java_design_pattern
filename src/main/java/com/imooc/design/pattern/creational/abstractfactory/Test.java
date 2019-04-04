package com.imooc.design.pattern.creational.abstractfactory;

/**
 * Created by dell on 2019/3/26.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
