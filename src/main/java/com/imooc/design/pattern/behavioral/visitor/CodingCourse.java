package com.imooc.design.pattern.behavioral.visitor;

/**
 * Created by dell on 2019/4/11.
 */
public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
