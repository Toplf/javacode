package com.luof.oop.encapsulation;

public class Phone {

    // 写一个类Phone, String os, double screen
    private String os;
    private double screen;

    public Phone() {}

    public Phone(String os, double screen) {
        this.os = os;
        this.screen = screen;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public double getScreen() {
        return screen;
    }

    public String say() {
        return "操作系统 : " + os + ", 屏幕 : " + screen;
    }

}