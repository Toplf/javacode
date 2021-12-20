package stu14.statictest;

import java.io.IOException;

/**
 * 单例 : 只允许有一个对象
 *
 * 饿汉式单例 : 加载类模板时创建对象, 适用于创建对象快速
 * 1) 防止测试类中new操作, 封装构造器
 * 2) 在内部创建唯一对象, 并用私有的静态属性的引用指向唯一对象, 同时就把对象创建出来
 * 3) 在类中再提供一个公共的静态方法, 用以获取唯一对象
 *
 * 懒汉式单例 : 只有在调用到方法时才创建对象, 适用于创建对象慢
 * 1) 封死new操作
 * 2) 声明私有静态属性的引用用来指向唯一对象
 * 3) 提供公共静态方法用来获取唯一对象, 第一次获取对象时才创建
 *
 */
class Singleton1 {

	private static Singleton1 only = new Singleton1();

	public static Singleton1 getInstance() {
		return only;
	}

	private Singleton1() { // 封装构造器
	}
}

class Singleton2 {

	private static Singleton2 only; // 初值为null

	public static Singleton2 getInstance() {
		if (only == null) {
			only = new Singleton2();
		}
		return only;
	}

	private Singleton2() {
	}
}

public class SingletonTest {

	public static void main(String[] args) throws IOException {
		//new Runtime();
		Runtime rt1 = Runtime.getRuntime();
		Runtime rt2 = Runtime.getRuntime();
		System.out.println(rt1 == rt2);

		int availableProcessors = rt1.availableProcessors();
		System.out.println(availableProcessors);
		rt1.exec("explorer http://www.126.com");
	}

	public static void main2(String[] args) {
		Singleton2 instance1 = Singleton2.getInstance();
		Singleton2 instance2 = Singleton2.getInstance();
		System.out.println(instance1 == instance2);
	}

	public static void main1(String[] args) {
		//Singleton1 s1 = new Singleton1();
		//Singleton1 s2 = new Singleton1();

		//Singleton1 s1 = Singleton1.only;
		//Singleton1.only = null; // 这样不安全
		//Singleton1 s2 = Singleton1.only;

		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();

		System.out.println(s1 == s2);
	}
}

