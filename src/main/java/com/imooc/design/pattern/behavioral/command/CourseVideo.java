package com.imooc.design.pattern.behavioral.command;

/**
 * Created by dell on 2019/4/11.
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name+ " open");
    }

    public void close() {
        System.out.println(this.name + "close");
    }
}
