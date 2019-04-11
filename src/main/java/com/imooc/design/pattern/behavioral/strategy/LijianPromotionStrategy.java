package com.imooc.design.pattern.behavioral.strategy;

/**
 * Created by dell on 2019/4/10.
 */
public class LijianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("立减");
    }
}
