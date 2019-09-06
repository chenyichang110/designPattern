package com.atguigu.prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Sheep {

    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


}

