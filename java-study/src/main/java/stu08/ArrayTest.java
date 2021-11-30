package stu08;

/**
 数组 : 一组相同类型的数据的集合, 数组是对象
 一个数组可以拥有多个元素.
 任意数据类型都可以创建数组

 数组声明 :
 元素数据类型[] 数组名;
 数组创建 :
 new 元素数据类型[数组长度];

 数组的元素就相当于数组对象的属性.

 数组的元素的访问, 通过 首地址 + 偏移量
 数组名[下标] 就是元素, 可以写入, 也可以读取它的值.

 数组对象一旦创建, 长度不允许修改, 元素类型也不允许修改!!!

 数组 == 循环
 */
class MyDate {

	private int year;
	private int month;
	private int day;

	public MyDate() {}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String say() {
		return year + "年" + month + "月" + day + "日";
	}
}
class ArrayTest6 {

	public static void main(String[] args) {
		MyDate[] arr; // 此时没有数组对象产生
		arr = new MyDate[4]; // 创建了数组对象

		// 对象数组的元素,必须真的要把对象实体new出来.
		arr[0] = new MyDate(1992, 2, 5);
		arr[1] = new MyDate(1998, 5, 10);
		arr[3] = new MyDate(2008, 8, 8);
		// 下标为2的元素是null, 极其危险, 所以这样的元素称为空洞, 因为不小心调用了对象的方法, 就会出异常

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i].say());
			} else {
				System.out.println(arr[i]); // 出现了空指针异常, 一定是有.操作
			}
		}
	}
}

class ArrayTest5 {

	public static void main(String[] args) {
		// 静态初始化1, 灵活性更强, 功能更强大
		int[] arr1 = new int[]{5, 4, 1, 9, 7}; // []中不可以加上长度
		// 遍历
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 静态初始化2, 不够灵活
		int[] arr2 = {1, 9, 7, 8, 2, 10, 50, 30}; // 使用场景 : 只适用于声明和创建初始化在同一行
		// 遍历
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		//arr2 = {1, 3, 5}; 不允许这样写
		arr2 = new int[]{1, 3, 5};

	}
}

class ArrayTest4 {

	public static void main(String[] args) {
		char[] chArr = new char[26];
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = (char)('a' + i);
		}

		// 遍历 请单独使用一个循环
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i] + " ");
		}
		System.out.println();

	}
}

class ArrayTest3 {

	public static void main(String[] args) {
		int[] arr = new int[15];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("i : " + i);
			arr[i] = (i + 1) * 10; // 把循环因子作成下标来用
		}

		// 遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

class ArrayTest2 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		System.out.println("数组长度 : " + arr.length); // 数组对象都有一个长度属性
		//arr.length = 6; // length属性是被final修饰的常量, 绝不允许修改

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//arr[4] = 50; 编译器不会做下标检查
		//arr[-1] = 5; 数组元素访问必须在其范围内, 否则就会出现异常...

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		//System.out.println(arr[4]);
	}
}

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr; // arr是一个引用型变量.
		arr = new int[5]; // 里面的元素全是0
		arr[0] = 3;
		arr[2] = 1;
		arr[arr[2]] = arr[0];
		arr[4] = arr[1] + arr[3];

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}