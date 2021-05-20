package com.atguigu.builder.improve;

import lombok.Data;
import lombok.ToString;

//产品
@Data
@ToString
public class House {
    //地基
    private String basie;
    //砌墙
    private String wall;
    //封顶
    private String roofed;
}
