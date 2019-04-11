package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * Created by dell on 2019/4/8.
 */
public class ConcreteTarget implements Target {

    public void request() {
        System.out.println("concreteTarget方法");
    }
}

