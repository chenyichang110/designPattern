package com.atguigu.decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc("加牛奶");
        setPrice(2f);
    }
}
