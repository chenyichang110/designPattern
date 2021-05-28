package com.atguigu.interpreter;

import java.util.Map;

/**
 * 加载解释器
 *
 * @author chenyichang
 * @date 2021/5/27 16:07
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {

        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
