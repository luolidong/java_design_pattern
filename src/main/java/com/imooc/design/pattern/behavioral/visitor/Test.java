package com.imooc.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/4/11.
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC 数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course:courseList) {
            course.accept(new Visitor());
        }
    }
}
