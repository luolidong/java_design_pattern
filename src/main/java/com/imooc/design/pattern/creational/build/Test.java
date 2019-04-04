package com.imooc.design.pattern.creational.build;

/**
 * Created by dell on 2019/3/27.
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("name","ppt","video","article","qa");

        System.out.println(course);
    }
}
