package com.imooc.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2019/4/10.
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> promotionStrategyMap = new HashMap<String, PromotionStrategy>();
    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();
    static {
        promotionStrategyMap.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
        promotionStrategyMap.put(PromotionKey.LIJIAN, new LijianPromotionStrategy());
        promotionStrategyMap.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
    }

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = promotionStrategyMap.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }
}
