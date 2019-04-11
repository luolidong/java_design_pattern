package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * Created by dell on 2019/4/10.
 */
public class DesignPatternCourse extends ACourse {
    void packageCourse() {
        System.out.println("提供课程JAVA源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
