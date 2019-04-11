package com.imooc.design.pattern.structural.composite;

/**
 * Created by dell on 2019/4/8.
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCouse = new Course("linux",11);
        CatalogComponent windowsCouse = new Course("windows", 12);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java dir");

        CatalogComponent mmallCourse1 = new Course("java 1", 11);
        CatalogComponent mmallCourse2 = new Course("java 2", 22);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("imooc main");
        imoocMainCourseCatalog.add(linuxCouse);
        imoocMainCourseCatalog.add(windowsCouse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
