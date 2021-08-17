package com.liuxiaocs.pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        // 创建意大利风味甜品工厂对象
        // ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        // 获取对应拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
