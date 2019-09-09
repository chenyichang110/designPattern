package com.atguigu.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            //可以有选择性的重写你需要的方法
            //比如这里我们重写m1的方法

            @Override
            public void m1() {
                System.out.println("重写了m1的方法");
            }
        } ;
        absAdapter.m1();
    }
}
