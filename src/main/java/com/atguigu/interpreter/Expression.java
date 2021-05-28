package com.atguigu.interpreter;

import java.util.Map;

/**
 * 抽象类表达式，通过HashMap键值对，获取变量的值
 *
 * @author chenyichang
 * @date 2021/5/25 18:45
 */
public abstract class Expression {

    /**
     * 解释公式和数值
     * key: 公式
     * value: 数值
     */
    public abstract int interpreter(Map<String, Integer> var);
}
