package stu11.array;

import java.util.Arrays;

public class ArrayTest {

	public static void quick(int[] arr, int begin, int end) { // 结束索引不包含
		if (end - begin <= 1) {
			return;
		}
		// 分区, 分3个部分, 中间是键, 左边是比键小, 右面比键大
		// 定位键索引最关键
		int key = arr[begin]; // 取第一个元素为键值
		int keyIndex = begin; // 键索引值, 用于动态保存比键值小的值.
		for (int i = begin + 1; i < end; i++) {
			if (arr[i] < key) {
				keyIndex++; // 只要找到了比key小的数据, keyIndex就右移
				// 交换keyIndex和i位置的值
				int tmp = arr[keyIndex];
				arr[keyIndex] = arr[i]; // 保证比键小的值在键的右面依次保存
				arr[i] = tmp;
			}
		}
		// 让键值归位到keyIndex位置处
		arr[begin] = arr[keyIndex];
		arr[keyIndex] = key; // 归位

		// 左子列递归
		quick(arr, begin, keyIndex);
		// 右子列递归
		quick(arr, keyIndex + 1, end);
	}

	public static void select(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
	}

	public static void bubble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[8000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20*8000000);
		}

		//bubble(arr);
		//select(arr);
		//quick(arr, 0, arr.length);
		Arrays.sort(arr); // 内部就是使用快速排序
		System.out.println("排序结束");


		/*
		// 遍历
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		//0 1 2  3 4  5  6 7
		//9 3 14 5 15 16 0 18
		//快速排序
		quick(arr, 0, arr.length);
		// 遍历
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		*/
	}

	public static void main3(String[] args) {
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20);
		}
		// 遍历
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		//0  1  2 3 4  5 6 7
		//10 13 7 1 15 16 7 0
		//选择排序是以位置为主导, 在恰当的位置放恰当的值
		//基准位置从0开始, 到倒数第2个元素
		for (int i = 0; i < arr.length - 1; i++) {
			// 以i为基准位置, 目标是让i位置中保存 包括基准位置在内到后面所有数中的最小值, 找下标
			int minIndex = i; // 从基准位置开始索引
			for (int j = i + 1; j < arr.length; j++) { // 从基准位置右面的所有数中定位最小值下标
				if (arr[j] < arr[minIndex]) { // 如果j位置的值小于最小值下标位置的值
					minIndex = j; // 记录当前最小值的下标
				}
			}
			// 循环结束后, minIndex中保存的就是最小值的下标
			// 交换基准位置和minIndex最小值位置的值
			int tmp = arr[i];
			arr[i] = arr[minIndex]; // 这是最关键的, 让最小值归位
			arr[minIndex] = tmp;
		}
		// 遍历
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

	public static void main2(String[] args) {
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20);
		}
		// 遍历
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		//0  1  2 3 4  5 6 7
		//10 13 7 1 15 16 7 0
		//冒泡
		/*
		for (int j = 0; j < arr.length - 1; j++) { // 控制趟数
			for (int i = 0; i < arr.length - 1 - j; i++) { // 控制每一趟的比较交换次数, 应该随着外循环的增加而减少
				if (arr[i] > arr[i + 1]) { // 比较相邻元素, 如果左大右小, 就交换
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}*/
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 比较相邻元素, j和j+1
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		// 遍历
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();

	}

	public static void main1(String[] args) {
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20);
		}
		// 遍历
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();

		// 取所有奇数
		int[] newArr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				newArr[count] = arr[i];
				count++;
			}
		}
		int[] finalArr = new int[count];
		for (int i = 0; i < count; i++) {
			finalArr[i] = newArr[i];
		}
		// 遍历final
		for (int tmp : finalArr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
}