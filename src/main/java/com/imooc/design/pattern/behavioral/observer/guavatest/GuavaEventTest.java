package com.imooc.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * Created by dell on 2019/4/11.
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post");
    }
}
