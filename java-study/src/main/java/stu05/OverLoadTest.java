package stu05;
/**
 方法的重载 : 也称为过载, 同一个类中, 方法名相同, 参数列表不同(数据类型不同, 个数不同, 顺序不同)
 方法的重载和返回值无关.

 实际执行时, 执行哪个方法由实参来决定

 实参只要可以被形参类型兼容即可.
 兼容性有匹配度, 优先的是完全匹配, 然后才是兼容匹配.

 对于调用者非常简单, 只需要记一个方法名即可. 实参可以随意.
 设计者复杂..
 */

public class OverLoadTest {

	public static int add(int a, int b) {
		System.out.println("add(int a, int b)...");
		int c = a + b;
		return c;
	}

	public static int add(int a, int b, int c) {
		System.out.println("add(int a, int b, int c)...");
		int d = a + b + c;
		return d;
	}

	public static double add(double a, double b) {
		System.out.println("add(double a, double b)...");
		double c = a + b;
		return c;
	}

	public static double add(int a, double b) {
		System.out.println("add(int a, double b)...");
		double c = a + b;
		return c;
	}

	/** 不能和上面的方法重载, 参数名不重要, 重要的是数据类型
	 public static double add(int b, double a) {
	 System.out.println("add(int b, double a)...");
	 double c = a + b;
	 return c;
	 }*/

	public static double add(double a, int b) {
		System.out.println("add(double a, int b)...");
		double c = a + b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println(add(5, 8));
		System.out.println(add(2.5, 3.8));
		System.out.println(add(10, 2.8));

		System.out.println("********************************");
		System.out.println(300);
		System.out.println(3.22);
		System.out.println(false);
		System.out.println('A');
		System.out.println("abc");

	}

}