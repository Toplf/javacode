package com.luof.oop.encapsulation;

public class DogTest {

    public static void main(String[] args) {
        // 再写一个测试类, 创建狗对象, 给对象的所有属性赋值, 再打印输出所有属性值, 再调用所有方法.
        Dog d = new Dog();
        d.name = "小黑";
        d.legs = 4;
        d.type = "黑背";

        System.out.println(d.name);
        System.out.println(d.legs);
        System.out.println(d.type);

        d.shout();
        d.eat("骨头");
        d.bite();
        String s = d.say();
        System.out.println(s);

        Dog d2 = new Dog();
        d2.name = "大白";
        d2.legs = 2;
        d2.type = "田园犬";

        System.out.println(d2.say());
    }
}