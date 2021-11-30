package stu06;

public class MethodTest {


	// 修饰符 返回值类型 方法名(形式参数列表) {}
	public static int add(int a, int b) {
		System.out.println("MethodTest add()...");
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("main begin");

		// 跨类调用
		System.out.println(Another.add(5, 7)); // Another.表示类限定, 方法现在隶属于Another类.
		System.out.println(Another.add(5.3, 8.7));

		System.out.println(MethodTest.add(5, 7));
		System.out.println(MethodTest.add(5.3, 8.7));

		System.out.println("main end");
	}
}