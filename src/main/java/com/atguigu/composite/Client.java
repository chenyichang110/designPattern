package com.atguigu.composite;

/**
 * 组合模式
 */
public class Client {
    public static void main(String[] args) {
        //创建大学
        University university = new University("清华大学", "niub");

        //创建学院
        College computerCollege = new College("计算机学院", "全是男人");
        College infoEngineerCollege = new College("信息工程学院", "难学");

        //加入到大学
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        //创建专业
        computerCollege.add(new Department("软件工程", "good"));
        computerCollege.add(new Department("网络工程", "nice"));
        computerCollege.add(new Department("计算机与技术", "en"));

        infoEngineerCollege.add(new Department("通信工程", "wawa"));
        infoEngineerCollege.add(new Department("信息工程", "hhhh"));

        //看整个大学的结构
        System.out.println("大学结构");
        university.print();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("看某个学院的结构");
        computerCollege.print();


    }
}
