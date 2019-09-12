package com.atguigu.composite;

import lombok.Data;

@Data
public abstract class OrganizationComponent {

    private String name;
    private String desc;

    //子类都需要实现
    protected abstract void print();

    protected void add(OrganizationComponent o) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent o) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

}
