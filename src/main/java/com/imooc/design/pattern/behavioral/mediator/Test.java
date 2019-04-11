package com.imooc.design.pattern.behavioral.mediator;

/**
 * Created by dell on 2019/4/11.
 */
public class Test {
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom = new User("Tom");

        geely.sendMessage("Hi Tom");
        tom.sendMessage("hi Geely");
    }
}
