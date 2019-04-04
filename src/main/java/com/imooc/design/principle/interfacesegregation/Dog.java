package com.imooc.design.principle.interfacesegregation;

/**
 * Created by dell on 2019/3/25.
 */
//public class Dog implements IAnimalAction {
//    public void eat() {
//
//    }
//
//    public void fly() {
//
//    }
//
//    public void swin() {
//
//    }
//}

public class Dog implements ISwimAnimalAction,IEatAnimalAction {
    public void eat() {

    }

    public void swin() {

    }
}
