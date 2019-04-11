package com.imooc.design.pattern.behavioral.interpreper;

/**
 * Created by dell on 2019/4/10.
 */
public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression,secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public int interpert() {
        return this.firstExpression.interpert() + this.secondExpression.interpert();
    }

    @Override
    public String toString() {
        return "+";
    }
}
