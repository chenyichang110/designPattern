package com.atguigu.iterator;

import java.util.Iterator;

/**
 * 大学
 *
 * @author chenyichang
 * @date 2021/5/28 15:02
 */
public interface College {
    /**
     * 获取名字
     */
    String getName();

    /**
     * 增加系
     */
    void addDepartment(String name, String desc);

    Iterator<?> createIterator();
}
