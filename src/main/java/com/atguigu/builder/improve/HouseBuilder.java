package com.atguigu.builder.improve;

//抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    //建造的流程
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造好，将产品返回
    public House buildHouse() {
        return house;
    }
}
