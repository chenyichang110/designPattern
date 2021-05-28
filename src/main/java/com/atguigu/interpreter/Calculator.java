package com.atguigu.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * 计算器
 * 简单实现加减操作
 *
 * @author chenyichang
 * @date 2021/5/27 18:03
 */
public class Calculator {
    private Expression expression;

    public Calculator(String exp) {
        Stack<Expression> stack = new Stack<>();
        char[] chars = exp.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }

        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
