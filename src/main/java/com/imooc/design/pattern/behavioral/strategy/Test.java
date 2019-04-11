package com.imooc.design.pattern.behavioral.strategy;

/**
 * Created by dell on 2019/4/10.
 */
public class Test {
    public static void main(String[] args) {
        String promotionKey = "LIJIAN";

        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));


        promotionActivity.executePromotionStrategy();
    }
}
