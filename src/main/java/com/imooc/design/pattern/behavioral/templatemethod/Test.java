package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * Created by dell on 2019/4/10.
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("后端设计模式start");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();
//        System.out.println("后端设计模式end");

        System.out.println("前端设计模式start");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端设计模式end");
    }
}
