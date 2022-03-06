package com.liuxiaocs.pattern.visitor;

/**
 * 具体元素角色类(宠物猫)
 */
public class Cat implements Animal {

    @Override
    public void accept(Person person) {
        // 访问者给宠物猫喂食
        person.feed(this);
        System.out.println("好好吃，喵喵喵...");
    }
}
