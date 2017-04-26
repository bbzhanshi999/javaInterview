package com.designModel.facade;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * Created by Administrator on 2017/3/28 0028.
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }


    public void startup(){
        System.out.println("Computer STARTUP");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");

    }

    public void shutdown(){
        System.out.println("Computer SHUTDOWN");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");

    }
}
