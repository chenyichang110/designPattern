package com.atguigu.factory.factorymethod.pizzastore;

import com.atguigu.factory.factorymethod.pizzastore.order.BJOrderPizza;
import com.atguigu.factory.factorymethod.pizzastore.order.LDOrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            new BJOrderPizza();
        } else {
            new LDOrderPizza();
        }
    }
}
