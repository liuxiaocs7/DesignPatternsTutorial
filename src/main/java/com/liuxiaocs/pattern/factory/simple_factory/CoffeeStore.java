package com.liuxiaocs.pattern.factory.simple_factory;

/**
 * 咖啡店
 * 解除了咖啡店和具体咖啡对象的耦合
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 调用生产咖啡方法
        Coffee coffee = factory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
