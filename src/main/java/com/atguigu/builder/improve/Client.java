package com.atguigu.builder.improve;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();

        House commonHouse = houseDirector.buildHouse(new CommonHouse());
        System.out.println(commonHouse);

        House highBuilding = houseDirector.buildHouse(new HighBuilding());
        System.out.println(highBuilding);
    }
}
