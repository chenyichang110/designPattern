package com.atguigu.decorator;

//咖啡，可以单点
public class Coffee extends Drink {

    @Override
    float cost() {
        return getPrice();
    }

    @Override
    String getDescAll() {
        return getDesc();
    }
}
