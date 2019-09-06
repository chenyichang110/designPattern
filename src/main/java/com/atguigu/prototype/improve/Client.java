package com.atguigu.prototype.improve;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("使用原型模式完成创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheepFriend = new Sheep("jack", 1, "黑色");
        sheep.friend = sheepFriend;

        Sheep clone1 = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        System.out.println("sheepFriend" + sheepFriend.hashCode());
        System.out.println(clone1 + " 他的friend的hashCode：" + clone1.friend.hashCode());
        System.out.println(clone2 + " 他的friend的hashCode：" + clone2.friend.hashCode());
        //通过运行得到  friend 并没有克隆，都是使用的sheepFriend
    }
}
