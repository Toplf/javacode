package stu16.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("main begin");

		int n = Integer.parseInt(args[0]); // 异常一旦出现, 就会导致程序崩溃
		System.out.println(n);

		System.out.println("main end"); // 重要代码
	}
}
