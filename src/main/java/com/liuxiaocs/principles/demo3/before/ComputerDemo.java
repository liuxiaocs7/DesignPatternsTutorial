package com.liuxiaocs.principles.demo3.before;

public class ComputerDemo {
    public static void main(String[] args) {
        // 创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        // 运行计算机
        computer.run();
    }
}
