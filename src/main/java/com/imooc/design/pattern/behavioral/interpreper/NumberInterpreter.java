package com.imooc.design.pattern.behavioral.interpreper;

/**
 * Created by dell on 2019/4/10.
 */
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    public int interpert() {
        return this.number;
    }
}
