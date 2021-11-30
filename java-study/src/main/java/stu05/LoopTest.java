package stu05;

class LoopTest10 {

	public static void main(String[] args) {
		l1 : for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue l1;
				}
			}
			System.out.println(i + "是质数");
		}
	}
}

class LoopTest9 {

	public static void main(String[] args) {
		l1 : for (int i = 0; i < 10; i++) {
			l2 : for (int j = 0; j < 5; j++) {
				if (j % 2 != 0) {
					//continue; // 默认中断离我最近的循环, 内循环的当次循环, 直接进入下一次
					continue l1; // 中断的是指定标签对应的循环的当次循环, 直接进行
					//System.out.println("after continue");
				}
				System.out.println("j : " + j);
			}
			System.out.println("i : " + i);
		}
	}
}

class LoopTest8 {

	public static void main(String[] args) {
		// continue中断当次循环, 直接进入下一次循环(迭代语句)
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("i : " + i);
		}
	}
}

class LoopTest7 {

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			boolean flag = true; // 假定i是质数
			// 从2~i-1中任意找到一个反例, 就可以推翻假设
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // 测试某个值是否可以整除i
					flag = false; // 推翻假设
					break; // 找到一个反例就足矣, 直接结束找反例的过程
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}

class LoopTest6 {

	public static void main(String[] args) {
		l1 : for (int i = 0; i < 10; i++) {
			l2 : for (int j = 0; j < 5; j++) {
				System.out.println("j : " + j);
				if (j == 2) {
					//break; // 默认中断离我最近的循环
					break l1; // 中断的是指定标签对应的语句块.
				}
			}
			System.out.println("i : " + i);
		}
	}
}

class LoopTest5 {

	public static void main(String[] args) {
		l1 : {
			System.out.println("1");
			if (1 == 1) {
				break l1;
			}
			System.out.println("2");
		}

		System.out.println("3");
	}
}

class LoopTest4 {

	public static void main(String[] args) {
		// break中断循环, 中断力度很大
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 3) {
				break; // 中断某个语句块, 中断循环
			}
		}
		System.out.println("after loop");
	}
}

class LoopTest3 {

	public static void main(String[] args) {
		// 死循环, 无限循环
		boolean loopFlag = true;
		while (loopFlag) {
			System.out.println("while1");
		}
		System.out.println("after loop");

		do {
			System.out.println("do while");
		} while (loopFlag);

		System.out.println("after loop2");

		/*
		for (int i = 0; i < 100; ) {
		}
		for (int i = 0; ; i++) {
		}
		for (int i = 0; true; i++) {
		}
		for (;;) {
		}
		*/
	}
}

class LoopTest2 {

	public static void main(String[] args) {
		// 区别, while 和 do while 循环次数不确定, 适用于循环次数不确定的循环
		boolean loopFlag = true;
		while (loopFlag) { // 执行0~N次
			System.out.println("循环体1");
		}

		do { // 执行1-N次, 至少有一次
			System.out.println("循环体2");
		} while (loopFlag);

		// for 循环天生的适用于控制循环次数
		for (int i = 0; i < 9; i++) {
			System.out.println("循环体3");
		}
	}
}

public class LoopTest {

	public static void main(String[] args) {
		//求1000以内所有质数的平均值
		int sum = 0;
		int count = 0;
		for (int i = 2; i < 1000; i++) {
			boolean flag = true; // 假定i是质数
			// 从2~i-1中任意找到一个反例, 就可以推翻假设
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // 测试某个值是否可以整除i
					flag = false; // 推翻假设
				}
			}
			if (flag) {
				System.out.println(i);
				sum += i;
				count++;
			}
		}

		int avg = sum / count;
		System.out.println("avg : " + avg);
	}
}