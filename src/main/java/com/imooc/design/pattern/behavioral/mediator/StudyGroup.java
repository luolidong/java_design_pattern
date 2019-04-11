package com.imooc.design.pattern.behavioral.mediator;

/**
 * Created by dell on 2019/4/11.
 */
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "]: " + message);
    }
}
