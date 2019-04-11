package com.imooc.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * Created by dell on 2019/4/11.
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe function,data : " +str);
    }
}
