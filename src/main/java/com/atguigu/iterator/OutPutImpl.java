package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author chenyichang
 * @date 2021/6/8 18:07
 */
public class OutPutImpl {
    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //输出学院
    public void printCollege() {
        for (College college : collegeList) {
            System.out.println("====" + college.getName() + "====");
            printDepartment(college.createIterator());
        }
    }

    //输出学院里面的系
    private void printDepartment(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
