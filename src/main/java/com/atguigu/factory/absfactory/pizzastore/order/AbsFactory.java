package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    //让工厂子类类具体实现
    public Pizza createPizza(String orderType);
}
