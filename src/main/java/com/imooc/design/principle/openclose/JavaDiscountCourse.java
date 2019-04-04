package com.imooc.design.principle.openclose;

/**
 * Created by dell on 2019/3/25.
 */

/**
 * 在ICount里面加折扣接口会照成所有实现的类都需要实现
 * 在JavaCount 的 getPrice里面加会失去原价
 * 通过继承基类 避免修改接口和基类 造成风险
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
