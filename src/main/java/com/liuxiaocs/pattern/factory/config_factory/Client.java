package com.liuxiaocs.pattern.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println("coffee = " + coffee.getName());

        Coffee coffee1 = CoffeeFactory.createCoffee("latte");
        System.out.println("coffee1 = " + coffee1.getName());
    }
}
