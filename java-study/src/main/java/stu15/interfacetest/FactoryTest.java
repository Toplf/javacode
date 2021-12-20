package stu15.interfacetest;

/**
 * 工厂模式 : 对象的创建复杂, 甚至无法完成, 通过工厂方法来获取对象
 */
interface Worker {
	void work();
}

class Teacher implements Worker {
	public void work() {
		System.out.println("老师在上课");
	}
}

class Student implements Worker {
	public void work() {
		System.out.println("学生在学习");
	}
}

class Factory {

	public static Worker getTeacher() {
		return new Teacher();
	}

	public static Worker getStudent() {
		return new Student();
	}
}

public class FactoryTest {

	public static void main(String[] args) {
		// 对象的获取 : new, 工厂方法, 反序列化, 反射, 直接开辟空间
		//Runtime runtime = Runtime.getRuntime(); // 通过方法获取对象
		Worker w = Factory.getTeacher();
		w.work();

		w = Factory.getStudent();
		w.work();
	}
}
