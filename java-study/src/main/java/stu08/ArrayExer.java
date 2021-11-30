package stu08;

class ArrayExer4 {

	public static void main(String[] args) {
		// 创建一个36个元素的字符数组, 前26个保存26个大写字母, 后10个保存数字字符'0'~'9'
		char[] arr = new char[36];
		for (int i = 0; i < arr.length; i++) {
			if (i < 26) {
				arr[i] = (char)('A' + i);
			} else {
				arr[i] = (char)('0' + i - 26);
			}
		}

		// 遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class ArrayExer3 {

	public static void main(String[] args) {
		// 创建一个36个元素的字符数组, 前26个保存26个大写字母, 后10个保存数字字符'0'~'9'
		char[] arr = new char[36];
		for (int i = 0; i < 26; i++) {
			arr[i] = (char)('A' + i);
		}
		for (int i = 26; i < arr.length; i++) {
			arr[i] = (char)('0' + i - 26);
		}

		// 遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class ArrayExer2 {

	public static void main(String[] args) {
		// 创建一个26个元素的字符数组, 保存26个大写字母
		char[] arr = new char[26];
		char ch = 'A';
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ch++;
		}
		// 遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

public class ArrayExer {

	public static void main(String[] args) {
		// 创建一个数组, 保存你的生日和今天的日期
		// 1978, 6, 9, 2019, 12, 3
		int[] arr = new int[6];
		arr[0] = 1978;
		arr[1] = 6;
		arr[2] = 9;
		arr[3] = 2019;
		arr[4] = 12;
		arr[5] = 3;

		System.out.println("生日 : " + arr[0] + "年" + arr[1] + "月" + arr[2] + "日");
		System.out.println("今天 : " + arr[3] + "年" + arr[4] + "月" + arr[5] + "日");

	}
}