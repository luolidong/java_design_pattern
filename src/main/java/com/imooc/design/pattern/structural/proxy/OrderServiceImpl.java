package com.imooc.design.pattern.structural.proxy;

/**
 * Created by dell on 2019/4/8.
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    public int saveOrder(Order order) {
        //Spring会自己注入,我们课程中就直接new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
