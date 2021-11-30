package stu06;
public class MyDateTest {

	public static void main(String[] args) {
		// 再写测试类, 在测试类中创建两个日期对象, 一个代表你的生日, 另一个代表今天的日期
		MyDate d1 = new MyDate();
		d1.year = 1978;
		d1.month = 6;
		d1.day = 9;

		MyDate d2 = new MyDate();
		d2.year = 2019;
		d2.month = 11;
		d2.day = 30;

		System.out.println("生日 : " + d1.say());
		System.out.println("今天 : " + d2.say());

		// 交换两个引用, 再打印输出.
		MyDate tmp = d1;
		d1 = d2;
		d2 = tmp;

		System.out.println("今天 : " + d1.say());
		System.out.println("生日 : " + d2.say());

	}
}