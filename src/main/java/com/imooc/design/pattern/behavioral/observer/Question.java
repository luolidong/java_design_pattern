package com.imooc.design.pattern.behavioral.observer;

/**
 * Created by dell on 2019/4/10.
 */
public class Question {
    private String userName;
    private String questionContent;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }
}
