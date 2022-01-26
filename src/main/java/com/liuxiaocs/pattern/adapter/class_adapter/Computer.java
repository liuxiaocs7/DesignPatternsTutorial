package com.liuxiaocs.pattern.adapter.class_adapter;

/**
 * 计算机类
 */
public class Computer {

    // 从SD卡中读取数据
    // 需要一个SDCard类型的参数
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is not null");
        }
        return sdCard.readSD();
    }
}
