package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * Created by dell on 2019/4/8.
 */
public class Test {
    public static void main(String[] args) {
        Target targe = new ConcreteTarget();
        targe.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
