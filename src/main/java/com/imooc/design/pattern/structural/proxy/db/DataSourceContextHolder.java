package com.imooc.design.pattern.structural.proxy.db;

/**
 * Created by dell on 2019/4/8.
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDERE = new ThreadLocal<String>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDERE.set(dbType);
    }

    public static String getDBType() {
        return CONTEXT_HOLDERE.get();
    }

    public  static void clearDBType() {
        CONTEXT_HOLDERE.remove();
    }
}
