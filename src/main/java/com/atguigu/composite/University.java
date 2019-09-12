package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

//大学
public class University extends OrganizationComponent {

    //管理 学院
    List<OrganizationComponent> list = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent o) {
        list.add(o);
    }

    @Override
    protected void remove(OrganizationComponent o) {
        list.remove(o);
    }

    //输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=============" + getName() + "=============");
        for (OrganizationComponent o : list) {
            o.print();
        }
    }
}
