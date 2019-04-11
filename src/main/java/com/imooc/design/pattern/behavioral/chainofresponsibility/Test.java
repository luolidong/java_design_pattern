package com.imooc.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by dell on 2019/4/11.
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("A");
        course.setArticle("B");
        course.setVideo("C");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
