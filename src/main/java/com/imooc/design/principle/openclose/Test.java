package com.imooc.design.principle.openclose;

/**
 * 开闭原则
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCource = new JavaDiscountCourse(96, "java", 348d);

        JavaDiscountCourse javaCource = (JavaDiscountCourse)iCource;
        System.out.println("课程id：" + javaCource.getId() + ", 课程名字：" + javaCource.getName() + ", 课程价格：" + javaCource.getOriginPrice());
    }
}
