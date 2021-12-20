package stu14.statictest;

// 多态 仅针对非静态方法而言
// 静态成员和覆盖,多态 无关
class A {
	static int s1 = 1;
	int a1 = 2;

	void test1() {
		System.out.println("A test1()");
	}

	static void test2() {
		System.out.println("A static test2()..");
	}
}

class B extends A {
	static int s1 = 10;
	int a1 = 20;

	void test1() {
		System.out.println("B test1()");
	}

	static void test2() {
		System.out.println("B static test2()..");
	}
}

public class StaticTest {

	public static void main(String[] args) {
		B b = new B();
		b.test1(); // 子类
		b.test2(); // 子类 等价于B.test2()
		System.out.println(b.s1); // 子类属性
		System.out.println(b.a1); // 子类属性

		A a = b;
		a.test1(); // 虚拟方法调用
		a.test2(); // 父类, 等价于A.test2()

		System.out.println(a.s1); // 等价于A.s1 // 1
		System.out.println(a.a1); // 父类属性 // 2
	}
}

