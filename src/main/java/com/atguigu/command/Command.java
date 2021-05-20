package com.atguigu.command;

/**
 * 命令接口
 *
 * @author chenyichang
 * @date 2021/5/20 16:19
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
