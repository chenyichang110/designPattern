package com.atguigu.principle.lishov.improve;

/**
 * 里式替换原则
 */
public class Liskov {

    public static void main(String[] args) {

    }


}

class Base {
    //把更加基础的方法和成员写到Base类

}

class A extends Base {
    //求减法
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base {
    //B 想使用A中的方法，可以使用组合
    private A a = new A();

    //这个方法虽然和 A 的方法名字一样 但是没有任何的关系
    public int func1(int i, int j) {
        return i + j;
    }

    //自己的方法
    public int func2(int i, int j) {
        return func1(i, j) + 9;
    }

    //想使用A的方法
    public int func3(int i, int j) {
        return a.func1(i, j);
    }
}




