package com.atguigu.command;

/**
 * @author chenyichang
 * @date 2021/5/20 16:32
 */
public class TVOnCommand implements Command {
    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
