package com.luof.oop.encapsulation;

public class Boy {

    private String name;
    private int age;

    public Boy() {}

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String say() {
        return "男孩, 姓名 : " + name + ", 年龄 : " + age;
    }

    public void shout() {
        System.out.println("作为男人, 压力大, 要喊一喊");
    }

    // this表示当前对象, 就是正在调用此方法的对象.
    public void marry(Girl girl) {
        System.out.println(this.say() + "要娶 " + girl.say() + ", 婚姻是坟墓");
        girl.marry(this);
    }
}