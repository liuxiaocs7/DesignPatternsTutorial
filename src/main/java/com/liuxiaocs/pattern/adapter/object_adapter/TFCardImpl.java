package com.liuxiaocs.pattern.adapter.object_adapter;

/**
 * 适配者类
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello word TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println(msg);
    }
}
