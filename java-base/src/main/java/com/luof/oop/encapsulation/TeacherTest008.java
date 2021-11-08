package com.luof.oop.encapsulation;

public class TeacherTest008 {
    public static void main(String[] args) {
        Computer com = new Computer(3.8, 8);
        Teacher008 t = new Teacher008("佟刚", 40, "男", com);
        t.lesson();
        t.jingdong();

        System.out.println(t.say());
    }
}
