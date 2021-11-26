package com.luof.oop.polymorphism;

class Base {

    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {

    int count = 20; // 属性不具备多态性, 因为属性没有覆盖一说, 属性只能共存

    @Override public void display() {
        System.out.println(this.count);
    }
}

public class TestFieldMethod {

    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); // 20
        s.display();
        Base b = s;
        System.out.println(b == s); // true
        System.out.println(b.count); // 10
        b.display(); // 20
    }
}



