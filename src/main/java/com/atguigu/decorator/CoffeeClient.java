package com.atguigu.decorator;

public class CoffeeClient {
    public static void main(String[] args) {
        //订单：2份巧克力+1份牛奶的LongBlank
        //1.点一份LongBlank
        Drink drink = new LongBlack();
        System.out.println(drink);
        System.out.println(drink.getDescAll() + drink.cost());
        //2.点一份牛奶
        drink = new Milk(drink);
        System.out.println(drink);
        System.out.println(drink.getDescAll() + drink.cost());
        //3.点一份巧克力
        drink = new Chocolate(drink);
        System.out.println(drink);
        System.out.println(drink.getDescAll() + drink.cost());
        //4.再点一份巧克力
        drink = new Chocolate(drink);
        System.out.println(drink);
        System.out.println(drink.getDescAll() + drink.cost());

    }
}
