package com.luof.oop.inheritance;

public class NotePad extends Computer {
    int satelite;

    public NotePad(double cpu, int memory, int disk, int satelite) {
        super(cpu, memory, disk);
        this.satelite = satelite;
    }

    public void navigate() {
        System.out.println("使用平板导航, CPU : " + getCpu());
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", 卫星 : " + satelite;
    }
}
