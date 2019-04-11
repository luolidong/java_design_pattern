package com.imooc.design.pattern.behavioral.interpreper;

/**
 * Created by dell on 2019/4/10.
 */
public class OperatorUtil {
    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || (symbol.equals("*")));
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}
