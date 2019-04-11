package com.imooc.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by dell on 2019/4/11.
 */
public class ArticleApprover extends Approver {
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() +"含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else{
            System.out.println(course.getName() + "不含有手记，不批准");
            return;
        }
    }
}
