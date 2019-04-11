package com.imooc.design.pattern.behavioral.visitor;

/**
 * Created by dell on 2019/4/11.
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
