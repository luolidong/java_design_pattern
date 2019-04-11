package com.imooc.design.pattern.behavioral.visitor;

/**
 * Created by dell on 2019/4/11.
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
