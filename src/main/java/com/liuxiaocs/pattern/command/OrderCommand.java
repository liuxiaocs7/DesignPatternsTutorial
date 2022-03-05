package com.liuxiaocs.pattern.command;

import java.util.Map;

/**
 * 具体的命令类
 */
public class OrderCommand implements Command {

    // 持有接收者对象
    private SeniorChef receiver;
    // 持有订单对象
    private Order order;

    // 由接收者对象(厨师)来执行这个命令
    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        // 遍历Map集合
        for (String foodName : foodDir.keySet()) {
            receiver.makeFood(foodName, foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable() + "桌的饭准备完毕!");
    }
}
