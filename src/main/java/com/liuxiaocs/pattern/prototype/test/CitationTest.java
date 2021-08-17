package com.liuxiaocs.pattern.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Citation c1 = new Citation();
        // 2. 克隆奖状对象
        Citation c2 = c1.clone();
        c1.setName("张三");
        c2.setName("李四");

        // 3. 调用show方法展示
        c1.show();
        c2.show();
    }
}
