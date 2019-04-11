package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * Created by dell on 2019/4/10.
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
