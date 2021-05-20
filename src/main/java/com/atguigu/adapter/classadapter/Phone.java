package com.atguigu.adapter.classadapter;

public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        int i = iVoltage5V.output5V();
        if (i == 5) {
            System.out.println("电压为5v，正在charging");
        } else {
            throw new RuntimeException("不可充电");
        }

    }
}
