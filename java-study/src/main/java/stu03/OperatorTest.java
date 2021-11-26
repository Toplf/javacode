class OperatorTest3 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]); // 这样写就是为了灵活, 程序中的n1中的值不确定了, 在运行时才确定
		int n2 = Integer.parseInt(args[1]);

		int max = n1 > n2 ? n1 : n2;
		System.out.println("max : " + max);


	}
}

class ArgsTest {

	public static void main(String[] args) {
		// 命令行参数 : 跟在命令后面的一系列字符串, 作用是给命令传递详细的数据.
		// 把命令行参数的字符串转成整数
		int n1 = Integer.parseInt(args[0]); // 把命令行参数中的第一个字符串转成真的整数
		int n2 = Integer.parseInt(args[1]); // 把命令行参数中的第二个字符串转成真的整数
		int n3 = Integer.parseInt(args[2]); // 把命令行参数中的第三个字符串转成真的整数
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}

class OperatorTest2 {

	public static void main(String[] args) {
		// 条件表达式 ? 表达式1 : 表达式2;
		// 找出两个数中的较大者
		int n1 = 100;
		int n2 = 50;

		int max = n1 > n2 ? n1 : n2;
		System.out.println("max : " + max);
	}
}

public class OperatorTest {

	public static void main(String[] args) {
		int n = 10;
		n = n++; // 先用后加
		System.out.println(n);

		int m = 10;
		m = ++m; // 先加后用
		System.out.println(m);

		/* 这样的写法不推荐
		int a, b, c;
		a = 1;
		b = 2;
		c = 3;
		*/

		int a = 1;
		int b = 2;
		int c = 3;

		//for (int i = 0; i < 10; i++)
		//for (int i = 0; i != 10; ++i) // 极致编程
	}
}