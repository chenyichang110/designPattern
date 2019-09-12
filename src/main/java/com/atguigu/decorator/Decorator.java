package com.atguigu.decorator;

//装饰者
public class Decorator extends Drink {
    //聚合
    Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }


    //得到总价
    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    //得到总描述
    public String getDescAll() {
        return super.getDesc() + "&&" + drink.getDesc();
    }
}
