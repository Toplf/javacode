package com.luof.oop.inheritance;

public class ComputerTest {

    public static void main2(String[] args) {
        PC pc = new PC(3.8, 14, 200, "应当");
        System.out.println(pc.getDetails());

    }

    public static void main1(String[] args) {
        PC pc = new PC();
        System.out.println(pc.getDetails());
    }

    public static void main(String[] args) {
        PC pc = new PC();
        pc.setCpu(3.2);
        pc.setMemory(8);
        pc.setDisk(1000);
        pc.keyboard = "小米键盘";
        System.out.println(pc.getDetails());

    }
}
