package com.imooc.design.pattern.creational.Singleton;

/**
 * Created by dell on 2019/4/3.
 */
//不能保证整个应用全局唯一，但是保证线程唯一
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {}

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }


}
