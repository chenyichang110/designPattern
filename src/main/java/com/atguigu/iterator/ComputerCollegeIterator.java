package com.atguigu.iterator;


import java.util.Iterator;

/**
 * @author chenyichang
 * @date 2021/6/1 14:36
 */
public class ComputerCollegeIterator implements Iterator<Department> {
    Department[] departments;
    int position = 0;//指针

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public synchronized Department next() {
        return departments[position++];
    }

    //该方法不实现会报错，先默认空实现，不能删除数据
    @Override
    public void remove() {

    }
}
