package com.imooc.design.pattern.creational.prototype.absractprototype;

/**
 * Created by dell on 2019/4/3.
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
