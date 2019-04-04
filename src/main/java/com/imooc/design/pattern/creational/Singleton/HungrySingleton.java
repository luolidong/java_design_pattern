package com.imooc.design.pattern.creational.Singleton;

import java.io.Serializable;

/**
 * Created by dell on 2019/4/2.
 */
// 一开始就创建，若没有使用会造成内存浪费
public class HungrySingleton implements Serializable{
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
