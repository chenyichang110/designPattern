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
        if (null == drink) {
            return super.getPrice();
        }
        return super.getPrice() + drink.cost();
    }

    //得到总描述
    public String getDescAll() {
        if (null == drink) {
            return super.getDesc();
        }
        return super.getDesc() + "&&" + drink.getDesc();
    }
}
