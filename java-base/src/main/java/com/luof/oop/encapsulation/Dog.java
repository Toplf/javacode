package com.luof.oop.encapsulation;

// 写一个类Dog, 特征: String name, int legs, String type..... 行为 public void shout()
// public void eat(String some) public void bite(), public String say()
public class Dog {

    String name;
    int legs;
    String type;

    public void shout() {
        System.out.println("狗在叫");
    }

    public void eat(String some) {
        System.out.println("狗在吃" + some);
    }

    public void bite() {
        System.out.println("狗在咬人");
    }

    // 返回一个字符串, 内容是对象的详细信息, 就是所有属性值的拼接结果
    public String say() {
        String str = "名字 : " + name + ", 腿数 : " + legs + ", 品种 : " + type;
        return str;
    }

}
