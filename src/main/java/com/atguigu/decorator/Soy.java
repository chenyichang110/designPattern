package com.atguigu.decorator;

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDesc(" 加豆浆");
        setPrice(1.5f);
    }
}
