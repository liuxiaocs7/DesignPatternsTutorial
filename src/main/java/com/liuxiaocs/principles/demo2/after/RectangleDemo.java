package com.liuxiaocs.principles.demo2.after;

public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 调用方法进行扩宽操作
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("===========================");
    }

    // 扩宽的方法
    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("Length: " + quadrilateral.getLength());
        System.out.println("Width: " + quadrilateral.getWidth());
    }
}
