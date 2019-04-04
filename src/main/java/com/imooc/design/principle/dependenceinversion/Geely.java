package com.imooc.design.principle.dependenceinversion;

/**
 * Created by dell on 2019/3/25.
 */
public class Geely {
    private ICourse iCourse;
//    public void studyJavaCourse() {
//        System.out.println("Geely is learning Java course");
//    }
//
//    public void studyFECourse() {
//        System.out.println("Geely is learning FE course");
//    }

    Geely() {

    }

    Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

//    public void studyImoocCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }
}
