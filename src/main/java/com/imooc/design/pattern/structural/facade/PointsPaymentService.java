package com.imooc.design.pattern.structural.facade;

/**
 * Created by dell on 2019/4/4.
 */
public class PointsPaymentService {
    public boolean pay(PointGift pointGift) {
        System.out.println("支付" + pointGift.getName() + " 支付成功");
        return true;
    }
}
