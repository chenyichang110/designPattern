package com.atguigu.builder.improve;

//指挥者，指定制作流程，并返回产品
public class HouseDirector {

    //如何处理建造房子的流程，交给指挥者
    public House buildHouse(HouseBuilder houseBuilder) {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
