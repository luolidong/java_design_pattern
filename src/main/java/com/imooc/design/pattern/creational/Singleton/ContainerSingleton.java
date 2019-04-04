package com.imooc.design.pattern.creational.Singleton;

import org.apache.commons.lang3.StringUtils;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2019/4/3.
 */
//缺点线程不安全
public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new HashMap<String,Object>();

    private ContainerSingleton() {}

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
