package com.imooc.design.pattern.behavioral.interpreper;

import java.util.Stack;

/**
 * Created by dell on 2019/4/10.
 */
public class GeelyExpressionParser {
    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol: strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈： %d", numberExpression.interpert()));
            } else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈： %d 和 %d",
                        firstExpression.interpert(), secondExpression.interpert()));

                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s",operator));

                int result = operator.interpert();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈： %d", resultExpression.interpert()));
            }
        }
       int result = stack.pop().interpert();
        return result;
    }
}
