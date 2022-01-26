package com.liuxiaocs.pattern.decorator;

/**
 * 装饰者角色
 * 抽象装饰者角色
 */
public abstract class Garnish extends FastFood {
    // 声明快餐类的变量
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        // 调用父类的构造器进行价格和描述的设置
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
