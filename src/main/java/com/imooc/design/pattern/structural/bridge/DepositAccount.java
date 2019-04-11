package com.imooc.design.pattern.structural.bridge;

/**
 * Created by geely
 */
public class DepositAccount implements Account {

    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }


    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
