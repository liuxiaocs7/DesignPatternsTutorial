package com.liuxiaocs.pattern.factory.static_factory;

/**
 * 咖啡店
 * 解除了咖啡店和具体咖啡对象的耦合
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        // 调用生产咖啡方法
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
