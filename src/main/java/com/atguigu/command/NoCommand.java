package com.atguigu.command;

/**
 * 空指令
 * <p>
 * 可以省略空判断
 *
 * @author chenyichang
 * @date 2021/5/20 16:27
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
