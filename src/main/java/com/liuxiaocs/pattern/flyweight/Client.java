package com.liuxiaocs.pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        // I图形是共享的
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        // 颜色是单独设置的
        box1.display("灰色");

        // 获取L图形
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("绿色");

        // 获取O图形
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("灰色");

        // 获取O图形
        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("红色");

        System.out.println("两次获取到的O图形对象是否是同一个对象：" + (box3 == box4));
    }
}
