package com.imooc.design.pattern.creational.simplefactory;

/**
 * Created by dell on 2019/3/25.
 * 简单工厂由来，为了解决应用类导入不同的video需要引入不同的类（java 或python）。
 */
public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        video.product();

        VideoFactory videoFactory = new VideoFactory();
        videoFactory.getVideo(JavaVideo.class).product();
    }
}
