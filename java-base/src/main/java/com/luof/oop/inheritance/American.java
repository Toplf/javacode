package com.luof.oop.inheritance;

public class American extends Person001 {
    private boolean hasGun;

    public American() {
    }

    public American(String name, int age, String gender, boolean hasGun) {
        //this.name = name;
        super(name, age, gender);
        this.hasGun = hasGun;
    }

    public void setHasGun(boolean hasGun) {
        this.hasGun = hasGun;
    }

    public boolean isHasGun() {
        return hasGun;
    }

    public void chiristmas() {
        System.out.println("merry christmas!!");
    }

    // 注解 : 一种特殊的注释, 不仅可以被程序员查看, 还可以被编译器和JVM识别
    // @Override作用就是告诉编译器, 下面的方法要覆盖了, 请帮我做语法检查
    @Override public String say() {
        return super.say() + ", 有枪 : " + hasGun;
    }

    @Override
    public void sayHello() {
        System.out.println("How are you?");
    }
}
