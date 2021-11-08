package com.luof.oop.encapsulation;

public class BoyGirlTest {

    public static void main(String[] args) {
        Boy boy = new Boy("ะกร๗", 28);
        Girl girl = new Girl("ะกภ๖");

        boy.marry(girl);

        boy.shout();

        boy.setAge(29);
    }
}