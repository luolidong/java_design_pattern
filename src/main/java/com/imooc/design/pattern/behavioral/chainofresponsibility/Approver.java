package com.imooc.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by dell on 2019/4/11.
 */
public abstract class Approver {
    protected Approver approver;
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
