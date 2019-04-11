package com.imooc.design.pattern.structural.proxy.dynamicproxy;

import com.imooc.design.pattern.structural.proxy.Order;
import com.imooc.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by dell on 2019/4/8.
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethor(argObject);
        Object object = method.invoke(target,args);
        afterMethor(argObject);
        return null;
    }

    private void beforeMethor(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before core");

        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        System.out.println("动态代理 before code");
    }

    private void afterMethor(Object obj) {
        System.out.println("动态代理 after core");
    }
}
