package com.imooc.design.pattern.structural.proxy;

/**
 * Created by dell on 2019/4/8.
 */
public class OrderDaoImpl implements  IOrderDao {
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 0;
    }
}
