package com.imooc.design.principle.singleresponsibility;

/**
 * Created by dell on 2019/3/25.
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }

    }
}
