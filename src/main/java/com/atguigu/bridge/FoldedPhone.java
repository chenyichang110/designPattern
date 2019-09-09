package com.atguigu.bridge;

//折叠手机
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
        //初始化手机样式
        super.phoneStyle = "折叠手机";
    }

}
