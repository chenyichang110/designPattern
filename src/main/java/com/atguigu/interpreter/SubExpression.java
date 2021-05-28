package com.atguigu.interpreter;

import java.util.Map;

/**
 * 减法解析器
 *
 * @author chenyichang
 * @date 2021/5/25 18:57
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> expression) {
        return super.left.interpreter(expression) - super.right.interpreter(expression);
    }
}
