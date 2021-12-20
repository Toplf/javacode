package stu17.exception;

public class TestException {

	public static void main(String[] args) {
		//System.out.println(2.0 / 0); // Infinity
		//System.out.println(0.0 / 0); // Not A Number
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int n3 = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + n3);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("其他异常 : " + e);
		}

		System.out.println("重要代码");
	}
}	
