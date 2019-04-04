package com.imooc.design.principle.singleresponsibility;

/**
 * Created by dell on 2019/3/25.
 * 单一职责原则
 */
public class Test {
    // v1
//    public static void main(String[] args) {
//        Bird bird = new Bird();
//
//        bird.mainMoveMode("大雁");
//
//        bird.mainMoveMode("鸵鸟");
//    }


    // v2 应用层判断逻辑不至于修改Bird引入问题
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
