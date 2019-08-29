package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    //加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
