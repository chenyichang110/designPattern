package com.atguigu.iterator;


import java.util.Iterator;

/**
 * @author chenyichang
 * @date 2021/5/28 15:22
 */
public class ComputerCollege implements College {
    //计算机学院下的专业
    Department[] departments;
    //保存当前数组的对象个数
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java", "java");
        addDepartment("php", "php");
        addDepartment("大数据", "大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator<?> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
