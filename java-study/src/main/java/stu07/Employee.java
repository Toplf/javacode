package stu07;
// 综合练习 : 写一个类Employee, 包含name, age, salary, dept, 属性要封装, get/set, say(), 并且提供2个构造器
public class Employee {

	private String name = "某员工";
	private int age = 30;
	private double salary;
	private String dept;

	public Employee() {
		this("马云", 50, 10000, "开发部");
	}

	public Employee(String name, int age, double salary, String dept) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public String say() {
		return "姓名 : " + name + ", 年龄 : " + age + ", 工资 : " + salary + ", 部门 : " + dept;
	}


}
	