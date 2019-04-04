package com.imooc.design.pattern.creational.factorymethod;

/**
 * Created by dell on 2019/3/26.
 */
public class JavaVIdeoFactory extends VideoFactory {

    public Video getVideo() {
        return new JavaVideo();
    }
}
