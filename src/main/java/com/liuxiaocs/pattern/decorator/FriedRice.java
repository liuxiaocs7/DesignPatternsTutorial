package com.liuxiaocs.pattern.decorator;

/**
 * 炒饭(具体构件角色)
 * 如果只要一个炒饭，那么价格就是10块
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        // 对父类的成员变量赋值
        super(10, "炒饭");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
