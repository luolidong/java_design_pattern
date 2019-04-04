package com.imooc.design.pattern.structural.facade;

/**
 * Created by dell on 2019/4/4.
 */
public class Test {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("T Shirt");

        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointGift);

    }
}
