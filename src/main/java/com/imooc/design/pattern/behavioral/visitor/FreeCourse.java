package com.imooc.design.pattern.behavioral.visitor;

/**
 * Created by dell on 2019/4/11.
 */
public class FreeCourse extends Course {
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
