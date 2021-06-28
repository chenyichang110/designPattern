package com.atguigu.iterator;

import java.util.ArrayList;

/**
 * 迭代器模式
 *
 * @author chenyichang
 * @date 2021/5/28 14:56
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<College> college = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        college.add(computerCollege);
        college.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(college);
        outPut.printCollege();

    }
}
