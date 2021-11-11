package com.luof.oop.inheritance;

public class PersonTest001 {
    public static void main(String[] args) {
        //Chinese ch = new Chinese();
        //ch.sayHello();

        // p引用指向的对象实体出现了不确定性.
        Person001 p = new Chinese(); // 只是把中国人看作是人
        //p.spring(); // 多态引用中子类特有的成员不可以访问.. 多态副作用!!

        //多态引用调用覆盖方法
        //虚拟方法调用(Virtual Method Invocation)
        //动态绑定 : 在运行时, 究竟执行谁的方法是不确定的, 要取决new的对象实体.
        p.sayHello(); // 编译时检查父类类型, 运行时执行子类类型..

        p = new American();
        p.sayHello();
    }

    public static void main3(String[] args) {
        Chinese ch = new Chinese();
        System.out.println(ch.say());

        //Chinese ch2 = new Chinese("张三", 30, "男", "猪");
        //System.out.println(ch2.say());
    }

    public static void main2(String[] args) {
        Chinese ch = new Chinese();
        //ch.setName("张三");
        //ch.setAge(30);
        //ch.setGender("男");
        ch.shuxiang = "猪";
        System.out.println(ch.say());

        American am = new American();
        am.setName("Jack");
        am.setGender("male");
        am.setAge(30);
        am.setHasGun(true);
        System.out.println(am.say());
    }

    public static void main1(String[] args) {
        Chinese ch = new Chinese();
        //ch.name = "张三";
        ch.setName("张三");
        //ch.age = 30;
        ch.setAge(30);
        //ch.gender = "男";
        ch.setGender("男");
        ch.shuxiang = "猪";

        //System.out.println(ch.name);
        System.out.println(ch.getName());
        System.out.println(ch.getAge());
        System.out.println(ch.getGender());
        System.out.println(ch.shuxiang);

        ch.spring();
        System.out.println(ch.say()); // 执行时, 执行的是子类的方法, 因为父类的方法被覆盖了.
        //System.out.println(ch.super.say()); 在测试类中尝试再去使用被覆盖方法, 不允许.
    }
}
