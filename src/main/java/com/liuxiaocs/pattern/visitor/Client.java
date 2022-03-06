package com.liuxiaocs.pattern.visitor;

public class Client {
    public static void main(String[] args) {
        // 创建Home对象
        Home home = new Home();
        // 添加元素到Home对象中
        home.add(new Dog());
        home.add(new Cat());

        // 创建主人对象
        Owner owner = new Owner();
        // 让主人喂食所有的宠物
        home.action(owner);

        System.out.println("===================");

        // 让某人喂食所有的宠物
        Someone someone = new Someone();
        home.action(someone);
    }
}
