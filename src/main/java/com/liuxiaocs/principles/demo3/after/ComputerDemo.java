package com.liuxiaocs.principles.demo3.after;


public class ComputerDemo {
    public static void main(String[] args) {
        // 创建组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();
        // 组装计算机
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        // 运行计算机
        computer.run();
    }
}
