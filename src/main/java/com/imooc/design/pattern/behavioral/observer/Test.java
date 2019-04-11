package com.imooc.design.pattern.behavioral.observer;

/**
 * Created by dell on 2019/4/10.
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java 设计模式");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("Java的主函数编写");

        course.produceQuestion(course,question);
    }
}
