package com.atguigu.decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("加巧克力");
        setPrice(3f);
    }

}
