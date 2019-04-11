package com.imooc.design.pattern.structural.adapter.objectAdapter;

/**
 * Created by dell on 2019/4/8.
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    public void request() {
        adaptee.adapteeRequest();
    }
}
