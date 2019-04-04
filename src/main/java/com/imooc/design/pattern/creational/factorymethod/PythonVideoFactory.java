package com.imooc.design.pattern.creational.factorymethod;

/**
 * Created by dell on 2019/3/26.
 */
public class PythonVideoFactory extends VideoFactory {

    public Video getVideo() {
        return new PythonVideo();
    }
}