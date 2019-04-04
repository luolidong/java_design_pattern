package com.imooc.design.pattern.structural.facade;

/**
 * Created by dell on 2019/4/4.
 */
public class QualifyService {
    public boolean isAvailable(PointGift pointGift) {
        System.out.println("校验"+pointGift.getName() + " 积分资格");
        return true;
    }


}
