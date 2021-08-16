package com.liuxiaocs.principles.demo2.before;

public class RectangleDemo {

    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        // 设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 调用resize方法进行扩宽
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("===========================");

        // 创建正方形对象
        Square square = new Square();
        // 设置长和宽
        square.setLength(10);
        square.setWidth(10);
        // 调用resize方法进行扩宽
        resize(square);
        printLengthAndWidth(square);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作(宽>长 则退出循环)
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
    }
}
