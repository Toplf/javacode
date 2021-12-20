package stu15.interfacetest;

interface A {
	void test();
}

interface B {
	void test();
}

interface C {
	void test();
}

// 接口只能继承接口, 不能继承类, 并且支持多继承
interface D extends A, B, C {
	void test();
}

class E implements D {
	public void test() {
		System.out.println("E test()...");
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		A a = new E();
		a.test(); // 虚拟方法调用
	}
}

interface A2 {
	int x = 0;
}

class B2 {
	int x = 1;
}

class C2 extends B2 implements A2 {
	public void pX() {
		System.out.println(A2.x);
	}

	public static void main(String[] args) {
		new C2().pX();
	}
}
