package com.luof.oop.inheritance;

import com.luof.oop.inheritance.array.Student;

public class PersonTest {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.name = "小明";
        stu.age = 20;
        stu.gender = "男";
        stu.school = "atguigu";

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.gender);
        System.out.println(stu.school);

        stu.study();
        System.out.println(stu.say());
    }
}
