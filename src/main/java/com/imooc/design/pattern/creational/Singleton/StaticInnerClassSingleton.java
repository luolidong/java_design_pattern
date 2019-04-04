package com.imooc.design.pattern.creational.Singleton;

/**
 * Created by dell on 2019/4/2.
 */
// 会立刻初始化的情况
// 1. 有一个A类型的实例被创建
// 2. A类中声明的静态方法被调用
// 3. A类中声明的静态成员被赋值
// 4. A类中声明的静态成员被使用，并且成员不是常量成员
// 5. A类是顶级类，并且类中有嵌套的断言语句
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    //私有构造器，防止被new出来
    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }
}
