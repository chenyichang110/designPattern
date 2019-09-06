package com.atguigu.prototype.deepclone;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

//要克隆的对象，含有一个引用类型的成员变量
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    //引用类型
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    //方式1：重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;

        //1.首先完成对基本数据类型的克隆
        obj = super.clone();

        //2.对引用类型的属性，单独处理
        DeepProtoType deepProtoType = (DeepProtoType) obj;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

    //方式2：序列化
    public Object deepCloneBySerializable() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copy = (DeepProtoType) ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                //关闭流
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
