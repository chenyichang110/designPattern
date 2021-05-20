package com.atguigu.command;

/**
 * 命令模式
 *
 * @author chenyichang
 * @date 2021/5/20 16:16
 */
public class Client {
    public static void main(String[] args) {

        //使用命令设计模式，完成通过遥控器，对电灯的操作

        //创建电灯的对象(接受者)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteControl remoteControl = new RemoteControl();

        //给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------按下灯的开按钮-----------");
        remoteControl.pressOn(0);
        System.out.println("--------按下灯的关按钮-----------");
        remoteControl.pressOff(0);
        System.out.println("--------按下撤销按钮-----------");
        remoteControl.undo();


        System.out.println("=========使用遥控器操作电视机==========");

        TVReceiver tvReceiver = new TVReceiver();

        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        //给我们的遥控器设置命令, 比如 no = 1 是电视机的开和关的操作
        remoteControl.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("--------按下电视机的开按钮-----------");
        remoteControl.pressOn(1);
        System.out.println("--------按下电视机的关按钮-----------");
        remoteControl.pressOff(1);
        System.out.println("--------按下撤销按钮-----------");
        remoteControl.undo();

    }
}
