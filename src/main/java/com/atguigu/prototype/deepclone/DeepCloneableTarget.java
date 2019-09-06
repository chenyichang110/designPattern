package com.atguigu.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //属性都是String，可以直接使用默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
