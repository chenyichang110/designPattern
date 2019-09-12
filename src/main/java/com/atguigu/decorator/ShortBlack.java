package com.atguigu.decorator;

//浓缩咖啡 即不加牛奶、糖或巧克力等添加物的清咖啡
public class ShortBlack extends Coffee {

    public ShortBlack() {
        setPrice(4f);
        setDesc("浓缩咖啡");
    }
}
