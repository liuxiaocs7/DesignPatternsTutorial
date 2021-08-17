package com.liuxiaocs.principles.demo4.after;

public class Client {
    public static void main(String[] args) {
        // 创建黑马安全门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();
        // 调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("==============================");
        // 创建传智安全门对象
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        // 调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
