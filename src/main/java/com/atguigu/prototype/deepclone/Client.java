package com.atguigu.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws Exception {
        //方式1
        DeepProtoType d = new DeepProtoType();
        d.name = "1";
        d.deepCloneableTarget = new DeepCloneableTarget("44", "55");

        DeepProtoType d1 = (DeepProtoType) d.clone();
        System.out.println("d.name=" + d.name + " d.target.hashcode=" + d.deepCloneableTarget.hashCode());
        System.out.println("d1.name=" + d1.name + " d1.target.hashcode=" + d1.deepCloneableTarget.hashCode());


        //方式2 ：序列化
        DeepProtoType d2 = (DeepProtoType) d.deepCloneBySerializable();
        System.out.println("d2.name=" + d2.name + " d2.target.hashcode=" + d2.deepCloneableTarget.hashCode());

    }
}
