package com.imooc.design.pattern.creational.Singleton;

/**
 * Created by dell on 2019/4/3.
 */
public enum EnumInstance {
    INSTANCE{
        protected  void printTest() {
            System.out.println("print Test");
        }
    };
    protected  abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
