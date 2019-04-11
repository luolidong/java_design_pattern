package com.imooc.design.pattern.behavioral.visitor;

/**
 * Created by dell on 2019/4/11.
 */
public class Visitor implements IVisitor {
    public void visit(FreeCourse freeCourse) {
        System.out.println("free :" + freeCourse.getName());
    }

    public void visit(CodingCourse codingCourse) {
        System.out.println("coding: " + codingCourse.getName() + " 价格:" + codingCourse.getPrice());
    }
}
