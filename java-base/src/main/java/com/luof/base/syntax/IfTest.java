package com.luof.base.syntax;

class IfTest4 {

	public static void main(String[] args) {
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
		}
	}
}

class IfTest3 {

	public static void main(String[] args) {
		/* 只能执行一个块
		if (条件布尔1) {
			语句块1; // 条件布尔1为真, 执行我
		} else if (条件布尔2) {
			语句块2; // 条件布尔1为假, 并且条件布尔2为真, 执行我
		} else if (条件布尔3) {
			语句块3; // 条件布尔1为假, 并且条件布尔2为假,  并且条件布尔3为真, 执行我
		} else if (条件布尔4) {
			语句块4; // 条件布尔1为假, 并且条件布尔2为假,  并且条件布尔3为假, 并且条件布尔4为真 执行我
		} else {
			语句块5 // 条件布尔1为假, 并且条件布尔2为假,  并且条件布尔3为假, 并且条件布尔4为假 执行我
		}
		*/


		int n = 4;

		if (n == 1) {
			System.out.println("n == 1");
		} else if (n >= 2) {
			System.out.println("n >= 2");
		} else if (n == 4) {
			System.out.println("n == 4");
		} else if (n == 5) {
			System.out.println("n == 5");
		} else if (n == 10) {
			System.out.println("n == 10");
		} else {
			System.out.println("else");
		}

		System.out.println("after if else if ....");
	}
}

class IfTest2 {

	public static void main(String[] args) {
		/* 语句块1和语句块2之间是互斥, 只能必须执行某一个.
		if (条件布尔) {
			语句块1; // 如果条件为真执行1
		} else {
			语句块2; // 如果条件为假执行2
		}*/
		int n = 40;

		if (n == 10) {
			System.out.println("n == 10");
		} else {
			System.out.println("n != 10");
			if (n == 40) {
				System.out.println("n == 40");
			}
		}

		System.out.println("after if else ");
	}
}

public class IfTest {

	public static void main(String[] args) {
		/*
		if (条件布尔) {
			语句块; // 如果条件布尔为真, 语句块就执行, 否则不执行
		}*/
		int n = 30;

		if (n == 10) {
			System.out.println("n == 10"); // 有条件执行
		}

		System.out.println("after if"); // 无条件执行
	}
}