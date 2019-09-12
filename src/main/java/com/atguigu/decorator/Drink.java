package com.atguigu.decorator;

import lombok.Data;

@Data
public abstract class Drink {

    //描述
    private String desc;
    //价格
    private float price;

    //计算价格
    abstract float cost();

    //得到总的描述
    abstract String getDescAll();
}
