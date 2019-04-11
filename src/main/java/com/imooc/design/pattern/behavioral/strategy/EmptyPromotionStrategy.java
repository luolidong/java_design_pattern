package com.imooc.design.pattern.behavioral.strategy;

/**
 * Created by dell on 2019/4/10.
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
