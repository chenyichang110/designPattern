package com.atguigu.interpreter;

import java.util.Map;

/**
 * 抽象运算符号解析器
 * 每个运算符号都只和左右两个数有关系。
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression的实现类
 *
 * @author chenyichang
 * @date 2021/5/25 18:53
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 默认实现，需要让其子类来实现逻辑
     */
    @Override
    public int interpreter(Map<String, Integer> var) {

        return 0;
    }
}
