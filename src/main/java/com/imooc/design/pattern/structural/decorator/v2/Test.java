package com.imooc.design.pattern.structural.decorator.v2;

/**
 * Created by dell on 2019/4/4.
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() +" 销售价格:" +aBattercake.cost());
    }
}
