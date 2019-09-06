package com.atguigu.prototype.improve;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;
    private String address = "蒙古";
    public Sheep friend;//对象，怎么克隆？


    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //使用默认的clone方法完成
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

