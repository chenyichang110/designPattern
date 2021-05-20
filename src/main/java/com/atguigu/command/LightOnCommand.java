package com.atguigu.command;

/**
 * 开灯指令
 *
 * @author chenyichang
 * @date 2021/5/20 16:23
 */
public class LightOnCommand implements Command {
    //聚合 执行者
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
