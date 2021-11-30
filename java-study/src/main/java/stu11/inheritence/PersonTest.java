package stu11.inheritence;

public class PersonTest {

	public static void main(String[] args) {
		Student stu = new Student();
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
