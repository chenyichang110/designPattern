package com.atguigu.principle.lishov;


public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();

        //这两个测试 就是本意求减法，却B中重写为加法，导致计算逻辑有误
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));

        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}


class A {
    //本意是 求减法
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}


class B extends A {
    //重写后，变成了求加法
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}