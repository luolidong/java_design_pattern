package com.imooc.design.pattern.structural.flyweight;

/**
 * Created by dell on 2019/4/8.
 */
public class Test {
    private static final String departemts[] = {"RD", "QA"};
    public static void main(String[] args) {
       for(int i = 0; i <10; i++) {
           String department = departemts[(int)(Math.random() * departemts.length)];
           Manager manager = (Manager) EmployeeFactory.getManager(department);
       }
    }
}
