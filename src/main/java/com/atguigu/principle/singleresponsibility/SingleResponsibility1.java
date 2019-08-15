package com.atguigu.principle.singleresponsibility;


public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 * 方式1
 * 1.违反了单一职责原则
 * 2.根据不同的交通工具，分解成不同的类即可
 */
class Vehicle {
    public void run(String vehicleName) {
        System.out.println(vehicleName + "在公路上运行");
    }

}
