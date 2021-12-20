package stu17.exception;

/*声明异常类IlleagalNumberException，用来表示无效数字异常
写一个TestException2类，在其中声明int divide(int m, int n)方法，该方法可抛出IlleagalNumberException异常。
方法的两个参数分别为被除数和除数，返回值为商
如果除数为0，则方法抛出IlleagalNumberException异常
改写main方法，调用divide方法计算商值打印输出，并捕获可能出现的异常。*/
public class TestException2 {

	public static int divide(int m, int n) throws IlleagalNumberException {
		try {
			return m / n;
		} catch (ArithmeticException e) {
			throw new IlleagalNumberException(e);
		}

		/*
		if (n == 0) {
			throw new IlleagalNumberException("除数不可以为0");
		}
		return m / n;
		*/
	}

	public static void main(String[] args) {
		try {
			System.out.println(divide(10, 5));
			System.out.println(divide(10, 0));
		} catch (IlleagalNumberException e) {
			System.out.println(e);
		}

		System.out.println("eeee");
	}
}
