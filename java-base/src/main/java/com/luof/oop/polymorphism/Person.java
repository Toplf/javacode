package com.luof.oop.polymorphism;

/**
 *	多态 : 看右面, 子类对象的多种父类形态, 看左面, 父类类型的引用指向的多种不确定的子类对象
 *	把子类对象 "看作是＂ 父类对象来使用.
 *
 *	本态 : 对象的本来形态.
 *
 *	多态引用 : 子类对象赋值于父类类型的引用变量, 父类类型的引用指向子类对象
 *	本态引用 : 子类对象赋值于本类类型的引用变量.
 *
 * // 造型有风险!!!! 需要先判断, 通过instanceof来判断
 */
public class Person {

	private String name;
	private int age;
	private String gender;

	public Person() {
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String say() {
		return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender;
	}

	public void sayHello() { // 虚拟方法
		System.out.println("打个招呼");
	}

}