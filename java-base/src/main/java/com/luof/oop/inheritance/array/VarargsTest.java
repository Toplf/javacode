package com.luof.oop.inheritance.array;

public class VarargsTest {

	/*
	public static int avg(int a, int b) {
		return (a + b) / 2;
	}

	public static int avg(int a, int b, int c) {
		return (a + b + c) / 3;
	}

	public static int avg(int a, int b, int c, int d) {
		return (a + b + c + d) / 4;
	}
	*/

    // 方法的可变参数只允许有一个, 并且必须放在末尾
    public static int avg(int... values) { // 可变参数, 个数可变, 个数任意
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    // 写一个可变参数方法
    public static int max(int... values) {
        int max = 0x80000000;
        for (int tmp : values) {
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(2, 5, 3));
        System.out.println(max(10, 8, 7, 2, 9 ,10, 30, 40, 7));
    }

	/*
	public static int avg(int[] values) { // 它和上面的方法冲突了
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum / values.length;
	}*/

    public static void main2(String... args) {
        System.out.println(avg(5, 9)); // 编译器 avg(new int[]{5, 9})
        System.out.println(avg(5, 1, 9));
        System.out.println(avg(5, 1, 20, 10)); // avg(new int[]{5, 1, 20, 10})
        System.out.println(avg(8));
        System.out.println(avg()); // avg(new int[]{})
        int[] arr = {9, 2, 8, 7};
        System.out.println(avg(arr)); // 编译器不作处理
        System.out.println(avg(null)); // 编译器不作处理
    }
}