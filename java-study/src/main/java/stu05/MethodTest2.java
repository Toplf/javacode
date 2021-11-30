package stu05;

public class MethodTest2 {

	public static void test(int a) {
		System.out.println("test " + a); // 1
	}

	public static int add(int a, int b) {
		test(a);
		System.out.println("add(" + a + "," + b + ").."); // 2
		short c = (short)(a + b);
		return c; // 返回的实际值只需要被返回值类型兼容即可
	}

	public static void main(String[] args) {
		System.out.println("main begin"); // 3
		short a = 20;
		byte b = 50;
		int c = add(a, b); // 实参是把值 赋值 给形参变量的.
		System.out.println(c);

		System.out.println("main end"); // 4
	}
}