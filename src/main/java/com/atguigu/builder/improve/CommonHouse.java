package com.atguigu.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        super.house.setBaise("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        super.house.setWall("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        super.house.setRoofed("普通房子屋顶");
    }
}
