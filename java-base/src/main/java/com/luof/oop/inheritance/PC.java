package com.luof.oop.inheritance;

public class PC extends Computer {
    String keyboard;

    public PC() {
        super(3.5, 8, 500);
    }


    public PC(double cpu, int memory, int disk,String keyboard) {
        super(cpu, memory, disk);
        this.keyboard = keyboard;
    }

    public  void  code(){
        System.out.println(getMemory());
    }

    @Override
    public String getDetails() {
        return super.getDetails()+ ", 键盘 : " + keyboard;
    }
}
