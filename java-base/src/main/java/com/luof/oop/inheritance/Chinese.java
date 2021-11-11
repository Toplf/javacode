package com.luof.oop.inheritance;

public class Chinese extends Person001{
    String shuxiang;

    // 在子类构造器中, 要么是this(...)要么是super(...)
    public Chinese() {
        //super(); // 如果在子类构造器中, 什么也没有时, 编译器会自动添加一个语句super(); 作用是直接调用父类的无参构造器
        //super("中国人", 20, "男"); // 显式地直接调用了父类的有参构造器
        //shuxiang = "未知";
        this("中国人", 20, "男", "未知");
        System.out.println("Chinese()..."); // 1
    }

    // 全参构造器
    public Chinese(String name, int age, String gender, String shuxiang) {
        //this.name = name; 子类中不可以直接访问父类继承来的私有属性
        //this.age = age;
        super(name, age, gender); // 直接显式地调用父类的全参构造器, 借用父类构造器完成子类从父类继承来的私有成员的初始化.
        this.shuxiang = shuxiang;
        System.out.println("Chinese(String, int, String, String)..."); // 2
    }

    public void spring() {
        //System.out.println("我是 : " + name + ", 过年是我最大的盼望"); // 子类中不可以直接访问父类继承的私有成员
        System.out.println("我是 : " + super.getName() + ", 过年是我最大的盼望"); // 子类中必须通过从父类继承的公共的get/set方法间接访问从父类继承的私有成员
    }

	/*
	public String say() {
		return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender;
	}*/

    // 方法的覆盖(重写), 子类中的方法会覆盖父类中的方法
    // super表示超级的意思, 作用是特别指定后面的成员是从父类继承
    @Override public String say() {
        //return "姓名 : " + getName() + ", 年龄 : " + getAge() + ", 性别 : " + getGender() + ", 属相 : " + shuxiang;
        return super.say() + ", 属相 : " + shuxiang;
    }

    @Override
    public void sayHello() {
        System.out.println("吃了吗???");
    }
}
