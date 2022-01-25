package com.liuxiaocs.pattern.builder.demo1;

/**
 * 具体产品对象：自行车
 */
public class Bike {

    // 车架
    private String frame;

    // 车座
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
