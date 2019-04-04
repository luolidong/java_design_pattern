package com.imooc.design.pattern.structural.decorator.v1;

/**
 * Created by dell on 2019/4/4.
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
