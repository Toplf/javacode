package com.luof.oop.encapsulation;

/**
 类是对象事物的描述.
 用属性描述事物的特征(数据部分)
 用方法描述事物的行为(功能部分)

 面向对象的重点是类的设计.
 类是模板, 所以有了类, 就可以直接方便的创建对象

 封装 : 成员私有化, 目的是保护成员, 通过方法间接处理成员可以在方法中做验证.

 this表示当前对象

 构造器(构造方法) : 是JVM在创建对象时主动调用的一个特殊方法, 作用就是在对象创建时作初始化工作.
 1) 方法名与类名一致, 唯一允许使用首字母大写的方法
 2) 无返回值声明, 连void也没有
 3) 不能被static、final、synchronized、abstract、native修饰，不能有return语句返回值
 4) 不能像普通方法一样随意调用, 构造器只能在创建对象时调用一次.(通过 new 类名()体现)

 如果在类中没有提供构造器, 编译器会自动添加一个缺省构造器
 缺省构造器特点 : 修饰符和类一致, 无参, 没有代码. . .
 如果在类中提供了构造器, 编译器就不会添加缺省构造器了

 结论 : 所有的类都必须有构造器.

 构造器也支持重载, 同一个类中,方法名相同, 参数不同(个数, 顺序, 类型)

 在构造器中使用this(...) 完成其他重载构造器的间接调用.
 this(...) 必须是构造器中的第一行, 这样的后果是如果有间接调用, 必须要保证了间接调用先于本构造器的执行.
 子类中的构造器一定有一个不是this

 构造器注意点:
 Java语言中，每个类都至少有一个构造器
 默认构造器的修饰符与所属类的修饰符一致
 一旦显式定义了构造器，则系统不再提供默认构造器
 一个类可以创建多个重载的构造器
 父类的构造器不可被子类继承

 */

public class Teacher007 {

    private String name = "某老师";
    private int age;
    private String gender = "未知";

    public Teacher007() {
    }

    public Teacher007(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            return; //方法提前出栈.
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    // 先写一个类Phone, 包含属性, String os, double screen.
    // 学生类中添加一个方法wangzhe(Phone phone) {}
    public void lesson(Computer computer) { // 对象的传递, 传递的是引用地址.
        System.out.println(name + "老师在使用电脑[" + computer.say() + "]在上课");
    }

    public void eat(String some) {
        System.out.println(name + "老师在吃" + some);
    }

    public String say() {
        return "姓名 : " + this.name + ", 年龄 : " + this.age + ", 性别 : " + gender;
    }

}


class Teacher0072 {

    // private表示私有的, 成员一旦被私有化, 这个成员只能在本类中使用了...
    private String name = "某老师";
    private int age;
    private String gender = "未知";

    public Teacher0072() { // 无参构造器, 调用简单, 对象的属性不能到位, 它最重要, JavaBean规范要求有它, 子类会默认用它, 便于反射.
        this("程程", 20, "女"); // 必须是构造器中的第一行
        System.out.println("Teacher()..."); // 1
        //this.name = "程程";
        //this.age = 20;
        //this.gender = "女";

    }

	/*
	public Teacher2(String name, int age) {
		this(name, age, "女");// 必须是构造器中的第一行
		System.out.println("Teacher(String, int)..."); // 2
		//this.name = name;
		//this.age = age;
		//this.gender = "女";
	}*/

    public Teacher0072(String name, int age, String gender) { // 全参构造器, 对象的属性一步到位, 调用复杂
        System.out.println("Teacher(String, int, String)..."); // 3
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 提供方法用于间接访问属性
    // 为了提高方法的签名的参数的可读性, 需要使用完全单词
    public void setName(String name) { // 间接的设置操作, set方法有参无返回
        // 变量访问的就近原则, name就是方法的局部变量name
        this.name = name; // this表示对象的意思
    }

    // 间接的读取操作
    public String getName() { // 间接的获取操作, get方法无参有返回
        return this.name;
    }

    // 通过方法的好处是可以对实参传来的值进行有效性验证.
    public void setAge(int age) {
        if (age < 0 || age > 120) {
            return; //方法提前出栈.
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void lesson() {
        System.out.println(name + "老师在上课");
    }

    public void eat(String some) {
        System.out.println(name + "老师在吃" + some);
    }

    // 返回对象的详细信息字符串
    public String say() {
        return "姓名 : " + this.name + ", 年龄 : " + this.age + ", 性别 : " + gender;
    }

}

class Teacher0071 {

    // 对象属性 或 实例变量
    // 虽然属性没有显式初始化, 但是JVM会自动给它进行隐式初始化. 值总是0
    String name = "佟刚"; // 显式初始化.
    int age = 40;
    String gender = "男";

    public void lesson() {
        System.out.println(name + "老师在上课");
    }

    public void eat(String some) {
        System.out.println(name + "老师在吃" + some);
    }

    // 返回对象的详细信息字符串
    public String say() {
        return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender;
    }

}