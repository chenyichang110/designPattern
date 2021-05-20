package com.atguigu.command;

/**
 * 遥控器
 *
 * @author chenyichang
 * @date 2021/5/20 16:34
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    //撤销命令
    Command undoCommand;

    //初始化
    public RemoteControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        //先设置为空命令
        for (int i = 0; i < 5; i++) {
            offCommands[i] = new NoCommand();
            onCommands[i] = new NoCommand();
        }
    }

    /**
     * 给遥控器设置命令
     *
     * @param number     第几组设置
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int number, Command onCommand, Command offCommand) {
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }

    /**
     * 按下了该组的开按钮
     */
    public void pressOn(int number) {
        onCommands[number].execute();
        //将该条命令记下，以便执行撤销
        undoCommand = onCommands[number];
    }

    /**
     * 按下了该组的关按钮
     */
    public void pressOff(int number) {
        offCommands[number].execute();

        undoCommand = offCommands[number];
    }

    /**
     * 撤销
     */
    public void undo() {
        undoCommand.undo();
    }
}
