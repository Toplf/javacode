class SwitchTest2 {

	public static void main(String[] args) {
		// switch中如果没有break, 它就不是严格意义的分支了.
		// 如果没有break会形成穿透(fall through)
		int n = Integer.parseInt(args[0]);
		switch (n) {
			default :
				System.out.println("default");
				break;
			case 1 :
				System.out.println("n == 1");
				//break;
			case 2 :
				System.out.println("n == 2");
				//break;
			case 5 :
				System.out.println("n == 5");
				break;
			case 10 :
				System.out.println("n == 10");
				//break;

		}
	}
}

public class SwitchTest {

	public static void main(String[] args) {
		/*
		int n = 5;
		if (n == 1) {
			System.out.println("n == 1");
		} else if (n == 2) {
			System.out.println("n == 2");
		} else if (n == 5) {
			System.out.println("n == 5");
		} else if (n == 10) {
			System.out.println("n == 10");
		} else {
			System.out.println("else");
		}*/

		/* 对变量中可能的值进行一个穷举, 列举. 可能的情况不会很多.
		switch (变量) { (必须是变量) 数据类型必须是非long整数, 字符串, 枚举.
			case 常量1 : case后面必须是常量(字面量或被final修饰的量) // if (变量 == 常量1)
				语句块1;
				break; // break的作用是破坏整个switch
			case 常量2 : // if (变量 == 常量2)
				语句块2;
				break;
			case 常量3 : // if (变量 == 常量3)
				语句块3;
				break;
			........
			case 常量N : // if (变量 == 常量N)
				语句块N;
				break;
			default : // else
				语句块M;
				break;
		} */

		int n = 5;
		switch (n) {
			case 1 :
				System.out.println("n == 1");
				break;
			case 2 :
				System.out.println("n == 2");
				break;
			case 5 :
				System.out.println("n == 5");
				break;
			case 10 :
				System.out.println("n == 10");
				break;
			default :
				System.out.println("default");
				break;
		}
	}
}