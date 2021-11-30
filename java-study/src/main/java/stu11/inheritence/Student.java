package stu11.inheritence;

// Student类是Person类的扩展
public class Student extends Person {

	/*
	String name;
	int age;
	String gender;

	public String say() {
		return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender;
	}
	*/

	String school;

	public void study() {
		System.out.println("学生在学习");
	}
}
