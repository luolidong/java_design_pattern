package com.imooc.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * Created by dell on 2019/4/10.
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName +"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
