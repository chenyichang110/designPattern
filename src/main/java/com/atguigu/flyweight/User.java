package com.atguigu.flyweight;

import lombok.Data;

/**
 * @author chenyichang
 * @date 2021/5/25 17:49
 */
@Data
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }
}
