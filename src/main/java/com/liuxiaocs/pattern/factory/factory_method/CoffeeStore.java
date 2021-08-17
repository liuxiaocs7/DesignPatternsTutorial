package com.liuxiaocs.pattern.factory.factory_method;


/**
 * 咖啡店
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    // 点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
