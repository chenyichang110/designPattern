package com.atguigu.bridge;

public class XiaoMi implements Brand {

    @Override
    public void call() {
        System.out.println("小米手机 call..");
    }

    @Override
    public void open() {
        System.out.println("小米手机 open...");
    }

    @Override
    public void close() {
        System.out.println("小米手机 close...");
    }
}
