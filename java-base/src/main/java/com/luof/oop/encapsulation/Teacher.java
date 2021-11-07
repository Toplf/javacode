package com.luof.oop.encapsulation;

/**
 类 : 对事物的描述, 是抽象的.
 事物具有特征和行为, 特征用属性来描述, 行为用方法来描述.

 对象 : 这类事物的一个具体的个体, 因而也称为实例.
 */
public class Teacher {

    // 描述事物的特征, 数据部分
    // 成员(member)变量, 专门用于描述事物的特征
    String name; // 对象属性, 实例变量
    int age;
    String gender;

    // 多个属性定义.....

    // 描述事物的行为, 动作. 功能部分
    // 成员(member)方法
    // 修饰符 返回值类型 方法名(参数列表) {方法体}
    public void lesson() {
        System.out.println(name + "老师在上课"); // 成员互访
    }

    public void eat(String some) {
        System.out.println(name + "老师在吃" + some);
    }

    // 对象的自我介绍, 对象的详细信息, 是一个字符串, 内容是所有属性值的拼接, 要返回
    public String say() {
        String str = "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender; // 成员之间可以直接互访
        return str;
    }

    // 多个方法定义.....

}