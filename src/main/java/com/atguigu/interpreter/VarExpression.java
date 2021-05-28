package com.atguigu.interpreter;

import java.util.Map;

/**
 * 变量解析器
 *
 * @author chenyichang
 * @date 2021/5/25 19:01
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> expression) {
        return expression.get(this.key);
    }
}
