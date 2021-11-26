package stu04;

class Work42 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);

		// 目标是num1中保存最小, num2中保存中值, num3中保存最大值
		// 1和2比
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		// 2和3比 把最大值冒到最右面
		if (num2 > num3) {
			int tmp = num2;
			num2 = num3;
			num3 = tmp;
		}

		// 1和2比 把次大值冒到次右面
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}

		System.out.println(num1 + "," + num2 + "," + num3);
	}
}

class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// 交换a,b
		int tmp = a;
		a = b;
		b = tmp;

		System.out.println("a : " + a + ", b : " + b);
	}
}

class Work4 {

	public static void main(String[] args) {
		//2 编写程序：接收三个命令行字符串并转换为整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出。
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);

		if (num1 < num2) { // 1 < 2
			if (num2 < num3) { // 1 < 2 , 2 < 3
				System.out.println(num1 + ", " + num2 + ", " + num3);
			} else if (num1 < num3) { // 1 < 2, 3 < 2, 1 < 3
				System.out.println(num1 + ", " + num3 + ", " + num2);
			} else { // 1 < 2, 3 < 2, 3 < 1
				System.out.println(num3 + ", " + num1 + ", " + num2);
			}
		} else { // 2 < 1
			if (num3 < num2) { // 2 < 1, 3 < 2
				System.out.println(num3 + ", " + num2 + ", " + num1);
			} else if (num1 < num3) { // 2 < 1, 2 < 3, 1 < 3
				System.out.println(num2 + ", " + num1 + ", " + num3);
			} else { // 2 < 1, 2 < 3, 3 < 1
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		}
	}
}

class Work32 {

	public static void main(String[] args) {
		/*4.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
		提示:接收命令行参数的字符方法*/
		char ch = args[0].charAt(0);
		String str = "other"; // 变量的初值最好有前设, 有意义.
		switch (ch) {
			case 'a' :
			case 'b' :
			case 'c' :
			case 'd' :
			case 'e' :
				ch -= 32;
				str = "" + ch;
		}
		System.out.println(str);
	}
}

class Work3 {

	public static void main(String[] args) {
		/*4.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
		提示:接收命令行参数的字符方法*/
		char ch = args[0].charAt(0);

		switch (ch) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default :
				System.out.println("other");
				break;
		}
	}
}

class Work22 {

	public static void main(String[] args) {
		//5.根据从命令行参数获取的月份，打印该月份所属的季节。
		//3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季
		int month = Integer.parseInt(args[0]);
		switch (month) {
			case 12 :
			case 1 :
			case 2 :
				System.out.println("冬季");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("春季");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("夏季");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("秋季");
				break;
			default :
				System.out.println("非法月份");
				break;
		}
	}
}

class Work2 {

	public static void main(String[] args) {
		//5.根据从命令行参数获取的月份，打印该月份所属的季节。
		//3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季
		int month = Integer.parseInt(args[0]);
		switch (month) {
			case 1 :
				System.out.println("冬季");
				break;
			case 2 :
				System.out.println("冬季");
				break;
			case 3 :
				System.out.println("春季");
				break;
			case 4 :
				System.out.println("春季");
				break;
			case 5 :
				System.out.println("春季");
				break;
			case 6 :
				System.out.println("夏季");
				break;
			case 7 :
				System.out.println("夏季");
				break;
			case 8 :
				System.out.println("夏季");
				break;
			case 9 :
				System.out.println("秋季");
				break;
			case 10 :
				System.out.println("秋季");
				break;
			case 11 :
				System.out.println("秋季");
				break;
			case 12 :
				System.out.println("冬季");
				break;
			default :
				System.out.println("非法月份");
				break;
		}
	}
}

class Work1 {

	public static void main(String[] args) {
		/*3 大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：
		高：180cm以上；富：财富1千万以上；帅：是。
		如果这三个条件同时满足，则：“我一定要嫁给他!!!”
		如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
		如果三个条件都不满足，则：“不嫁！”*/
		int height = Integer.parseInt(args[0]);
		int money = Integer.parseInt(args[1]);
		boolean handsome = Integer.parseInt(args[2]) != 0;

		if (height > 180 && money > 10000000 && handsome) {
			System.out.println("我一定要嫁给他!!");
		} else if (height > 180 || money > 10000000 || handsome) {
			System.out.println("嫁吧，比上不足，比下有余");
		} else {
			System.out.println("不嫁！");
		}
	}
}