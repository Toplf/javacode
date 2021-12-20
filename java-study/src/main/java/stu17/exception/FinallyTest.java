package stu17.exception;

public class FinallyTest {

	public static int test() {
		int n = 10;
		try {
			return n;
		} finally {
			// 无论前面发生什么都要执行
			++n;
			System.out.println("finally");
			//return n;
		}
	}

	public static void main(String[] args) {
		System.out.println(test());
	}
}