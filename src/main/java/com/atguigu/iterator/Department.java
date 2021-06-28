package com.atguigu.iterator;

import lombok.Data;

/**
 * @author chenyichang
 * @date 2021/6/8 17:55
 */
@Data
public class Department {
    private String name;
    private String desc;

    public Department(String name, String desc) {

        this.name = name;
        this.desc = desc;
    }
}
