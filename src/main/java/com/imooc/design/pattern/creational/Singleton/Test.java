package com.imooc.design.pattern.creational.Singleton;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by dell on 2019/3/27.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

//        HungrySingleton instance = HungrySingleton.getInstance();

//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());

//        Class objectClass = HungrySingleton.class;
//        Class objectClass = LazySingleton.class;
//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton)constructor.newInstance();

        //反射破坏懒汉单例模式
//        LazySingleton newInstance = (LazySingleton)constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);

    }
}
