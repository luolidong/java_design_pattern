package com.imooc.design.pattern.creational.Singleton;

/**
 * Created by dell on 2019/3/28.
 */
public class LazyDoubleCheckSingleton {
    // volatile 线程安全的延迟初始化，禁止重排序。
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 2和3步骤可能会颠倒，先3后2， intra-thread semantics 保证重排序不会改变单线程程序的执行结果
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
