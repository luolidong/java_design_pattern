package com.imooc.design.principle.singleresponsibility;

/**
 * Created by dell on 2019/3/25.
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
//        address = "beijing";
    }

    private void updateUserName(String userName) {
        userName = "geely";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // TODO something1
        } else {
            // TODO something2
        }
        userName = "geely";
        address = "beijing";
    }
}
