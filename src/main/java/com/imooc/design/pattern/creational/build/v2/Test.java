package com.imooc.design.pattern.creational.build.v2;

/**
 * Created by dell on 2019/3/27.
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseArticle("java").buildCoursePPT("ppt").buildCourseVideo("video").build();
        System.out.println(course);


    }
}
