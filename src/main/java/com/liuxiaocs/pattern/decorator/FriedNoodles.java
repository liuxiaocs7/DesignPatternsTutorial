package com.liuxiaocs.pattern.decorator;

/**
 * 炒面(具体的构件角色)
 * 如果只要一个炒面，那么价格就是10块(base)
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        // 对父类的成员变量赋值
        super(12, "炒面");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
