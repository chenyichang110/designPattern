package com.atguigu.adapter.classadapter;

//适配类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int i = output220V();
        return i / 44;
    }
}
