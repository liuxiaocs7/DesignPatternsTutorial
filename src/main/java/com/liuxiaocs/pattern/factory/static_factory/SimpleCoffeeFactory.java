package com.liuxiaocs.pattern.factory.static_factory;

/**
 * 简单咖啡工厂类，用来生成咖啡
 * 工厂和咖啡对象耦合了，违背了开闭原则
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        return coffee;
    }
}
