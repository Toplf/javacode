package com.luof.oop.polymorphism;

public class PersonTest {

	// 方法可以接收任意Person及子类对象, 兼容性提高了, 但是对象的具体类型是什么有些模糊
	public static void test(Person p) { // 接收对象, 参数就是父类类型的, 多态参数方法
		p.sayHello();

		//p.spring(); 多态副作用

		// instanceof 判断左侧引用指向对象的实体是否是 右侧的类型的一个对象, 如果是, 返回true, 不是返回false
		if (p instanceof Beijing) {
			System.out.println("咱是北京人");
		} else if (p instanceof Chinese) { //if (对象真的是中国人) {
			Chinese ch = (Chinese)p; // 造型有风险!!!! 需要先判断
			ch.spring();
		} else if (p instanceof American) {
			((American)p).christmas();
		} else {
			System.out.println("普通人");
		}
	}

	public static void main(String[] args) {
		Chinese ch = new Chinese("张三", 30, "男", "牛");
		American am = new American("Jack", 35, "male", true);
		Person p = new Person("某人", 25, "未知");
		Beijing bj = new Beijing("李四", 40, "女", "猪");

		test(p);
	}

	public static void main3(String[] args) {
		// 创建一个数组, 可以容纳各种不同类型的对象时, 需要多态, 这样的数组称为多态数组
		Person[] arr = new Person[5];

		arr[0] = new Chinese("张三", 30, "男", "牛");
		arr[1] = new American("Jack", 35, "male", true);
		arr[2] = new Person("某人", 25, "未知");
		arr[3] = new American("Rose", 20, "female", false);
		arr[4] = new Beijing("李四", 40, "女", "猪");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].say());
		}

		System.out.println("******************************************************");
		// 排序
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].getAge() > arr[j + 1].getAge()) {
					Person tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].say());
		}

		System.out.println("******************************************************");

	}

	public static void main2(String[] args) {
		Chinese ch = new Chinese("张三", 30, "男", "牛");
		Person p1 = ch;

		Beijing bj = new Beijing("李四", 40, "女", "猪");
		ch = bj;
		p1 = bj;

		//p1.spring(); 多态副作用, 子类特有成员隐藏
		p1.sayHello(); // 通过多态引用调用覆盖方法
		// 虚拟方法调用 : 编译时检查引用的类型, 运行时动态定位对象实体.

		p1 = new American("Jack", 35, "male", true);

		p1.sayHello();

	}
}	
