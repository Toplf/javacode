package com.luof.oop.polymorphism;

public class ComputerTest {

	/*在Test类中提供一个静态方法listPrice,以Computer引用变量为参数，打印输出电脑价格。
	在main方法中，分别以Computer、PC、NotePad对象为参数，调用listPrice方法。
	在方法listPrice中，判断Computer参数的真实对象，并调用不同对象上的特有方法*/
	public static void listPrice(Computer com) {
		System.out.println(com.getPrice());

		if (com instanceof PC) {
			PC pc = (PC)com;
			pc.code();
		} else if (com instanceof NotePad) {
			((NotePad)com).navigate();
		} else {
			System.out.println("普通电脑");
		}
	}

	public static void main(String[] args) {
		listPrice(new PC(3.8, 16, 2000, 8000, "樱桃"));
		listPrice(new NotePad(2.0, 4, 128, 3000, 3));
		listPrice(new Computer(2.5, 6, 500, 2500));
	}

	public static void main2(String[] args) {
		Computer[] arr = new Computer[5];
		arr[0] = new PC(3.8, 16, 2000, 8000, "樱桃");
		arr[1] = new NotePad(2.0, 4, 128, 3000, 3);
		arr[2] = new Computer(2.5, 6, 500, 2500);
		arr[3] = new PC(4.5, 32, 12000, 15000, "联想键盘");
		arr[4] = new NotePad(1.0, 2, 32, 800, 1);

		for (Computer tmp : arr) {
			System.out.println(tmp.getDetails());
		}

		System.out.println("****************************************************");
		// 排序
		for (int i = 0; i < arr.length - 1; i++) {
			// i位置 就是基准位置, 用于保存最小值
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].getPrice() < arr[minIndex].getPrice()) {
					minIndex = j;
				}
			}

			Computer tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}

		for (Computer tmp : arr) {
			System.out.println(tmp.getDetails());
		}

		System.out.println("****************************************************");
	}

}
