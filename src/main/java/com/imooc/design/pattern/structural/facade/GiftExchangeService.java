package com.imooc.design.pattern.structural.facade;

/**
 * Created by dell on 2019/4/4.
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointGift pointGift) {
        //资格验证通过
        if (qualifyService.isAvailable(pointGift)) {
            //如果支付积分成功
            if (pointsPaymentService.pay(pointGift)) {
                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功");
            }
        }
    }
}
