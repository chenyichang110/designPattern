package com.atguigu.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPrototype {

    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
        ap.getBean("xxx");
    }
}
