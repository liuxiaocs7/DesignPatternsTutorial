package com.liuxiaocs.pattern.state.before;

public class Client {
    public static void main(String[] args) {
        // 创建电梯兑现
        Lift lift = new Lift();

        // 设置当前电梯的状态
        lift.setState(ILift.OPENING_STATE);

        // 打开
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
