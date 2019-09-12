package com.atguigu.composite;

//专业，叶子节点
public class Department extends OrganizationComponent {

    //没有集合，不管理
    //因为是叶子节点，不用重写add、remove方法

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }


}
