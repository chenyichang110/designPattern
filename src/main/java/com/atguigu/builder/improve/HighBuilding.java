package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        super.house.setBasie("高楼的打地基100米");
    }

    @Override
    public void buildWalls() {
        super.house.setWall("高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        super.house.setRoofed("高楼的透明屋顶");
    }
}
