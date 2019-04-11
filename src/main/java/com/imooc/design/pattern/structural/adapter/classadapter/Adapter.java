package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * Created by dell on 2019/4/8.
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.adapteeRequest();
    }
}
