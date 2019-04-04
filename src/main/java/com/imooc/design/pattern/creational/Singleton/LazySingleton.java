package com.imooc.design.pattern.creational.Singleton;

/**
 * Created by dell on 2019/3/27.
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    // 锁了整个类，对性能的影响比较大
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
