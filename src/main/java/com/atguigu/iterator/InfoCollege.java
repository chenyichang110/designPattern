package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author chenyichang
 * @date 2021/6/8 17:57
 */
public class InfoCollege implements College {
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("1", "1");
        addDepartment("2", "2");
        addDepartment("3", "3");
        addDepartment("4", "4");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator<?> createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
