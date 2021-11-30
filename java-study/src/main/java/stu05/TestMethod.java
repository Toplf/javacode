package stu05;

public class TestMethod {

	// 编写程序,声明一个类TestMethod，在其中声明一个method方法，在方法中打印一个20*8的矩形，在main方法中调用该方法。
	// 功能弱, 调用简单
	public static void method1() {
		// 打印20 * 8的矩形
		/*
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		method1(20, 8);
	}
	/*
	在上一个练习中的TestMethod类中再声明一个方法method1，在方法中打印一个n*m的矩形，
	并在方法结束后返回矩形周长, 在main方法中调用该方法, 并打印周长.
	*/
	// 功能强大, 调用复杂
	public static int method1(int n, int m) {
		// 打印n * m的矩形
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		int l = 2 * (n + m);
		return l;
	}

	//在TestMethod类中再声明一个重载方法method1，在方法中打印一个边长为n的正方形，
	//并在方法结束后返回正方形周长, 在main方法中调用该方法, 并打印周长.
	public static int method1(int n) {
		// 打印边长为n的正方形
		/*
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}*/
		int l = method1(n, n);
		return l;
	}


	public static void main(String[] args) {
		System.out.println("main begin");

		method1(); // 无论怎么调用, 它都是20*8的矩形

		int x = method1(10, 30); // 10行30列的矩形
		System.out.println("矩形周长 : " + x);

		int y = method1(50);
		System.out.println("正方形周长 : " + y);

		System.out.println("main end");
	}

}