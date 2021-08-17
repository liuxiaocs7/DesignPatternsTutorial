package com.liuxiaocs.pattern.factory.before;

/**
 * 咖啡店
 * 违背了开闭原则：如果来了一种新的咖啡类，就得改源码
 * 咖啡店和美式咖啡、拿铁咖啡耦合严重
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
