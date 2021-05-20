package com.atguigu.command;

/**
 * 关灯指令
 *
 * @author chenyichang
 * @date 2021/5/20 16:23
 */
public class LightOffCommand implements Command {
    //聚合 执行者
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
