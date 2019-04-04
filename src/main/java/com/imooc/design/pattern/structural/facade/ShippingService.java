package com.imooc.design.pattern.structural.facade;

/**
 * Created by dell on 2019/4/4.
 */
public class ShippingService {
    public String shipGift(PointGift pointGift) {
        //物流系统的对接逻辑
        System.out.println(pointGift.getName() +"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }

}
