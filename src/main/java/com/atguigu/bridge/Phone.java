package com.atguigu.bridge;

import lombok.Data;

@Data
public abstract class Phone {

    protected String phoneStyle;

    //组合了品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }


    protected void open() {
        System.out.println(phoneStyle);
        this.brand.open();

    }

    protected void close() {
        System.out.println(phoneStyle);
        this.brand.close();
    }

    protected void call() {
        System.out.println(phoneStyle);
        this.brand.call();
    }

}
