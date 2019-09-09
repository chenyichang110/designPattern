package com.atguigu.adapter.objectadapter;

//适配器类
public class VoltageAdapter implements IVoltage5V {

    //聚合被适配的类
    private Voltage220V v;

    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int output5V() {

        int src = v.output220V();

        return src / 44;
    }
}
