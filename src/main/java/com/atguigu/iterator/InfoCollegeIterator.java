package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author chenyichang
 * @date 2021/6/8 17:58
 */
public class InfoCollegeIterator implements Iterator<Department> {
    private List<Department> departmentList;
    int index = -1;//索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {

            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }

    //空实现remove
    @Override
    public void remove() {

    }
}
