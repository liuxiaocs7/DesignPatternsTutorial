package com.liuxiaocs.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类(属于请求者角色)
 */
public class Waiter {
    // 持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        // 将cmd对象存储到List集合中
        this.commands.add(command);
    }

    // 发起命令功能，喊订单来了
    public void orderUp() {
        System.out.println("服务员：大厨，新订单来了......");
        // 向大厨传递所有的命令，遍历list集合
        for (Command command : commands) {
            if(command != null) {
                command.execute();
            }
        }
    }
}
