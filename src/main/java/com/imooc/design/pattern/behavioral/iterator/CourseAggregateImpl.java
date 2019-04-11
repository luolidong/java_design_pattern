package com.imooc.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geely.
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }


    public void addCourse(Course course) {
        courseList.add(course);
    }


    public void removeCourse(Course course) {
        courseList.remove(course);
    }


    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
