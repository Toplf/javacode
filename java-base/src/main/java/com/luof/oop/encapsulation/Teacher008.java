package com.luof.oop.encapsulation;

public class Teacher008 {
    private String name;
    private int age;
    private String gender;
    private Computer myComputer;

    public Teacher008() {
    }

    public Teacher008(String name, int age, String gender, Computer myComputer) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.myComputer = myComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Computer getMyConputer() {
        return myComputer;
    }

    public void setMyConputer(Computer myComputer) {
        this.myComputer = myComputer;
    }

    public String say() {
        return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender + ", 我的电脑 : " + myComputer.say();
    }

    //public void lesson(Computer com) { // 对象的传递
    public void lesson() {
        System.out.println(name + "老师使用电脑[" + myComputer.say() + "]在上课"); // 在这里就可以使用关联的对象
    }

    public void jingdong() {
        System.out.println("使用电脑[" + myComputer.say() + "]上京东");
    }
}
