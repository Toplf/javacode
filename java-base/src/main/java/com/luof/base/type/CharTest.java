package com.luof.base.type;

class CharTest2 {

	public static void main(String[] args) {
		char c1 = 'a';

		char c2 = 10;
		char c3 = '\n'; // 换行, 转义字符

		char c4 = '\r'; // 码值是13
		char c5 = 13;

		char c6 = '\t'; // 制表符
		char c7 = 9;

		System.out.println(c2);
		System.out.println(c3);
	}
}

public class CharTest {

	public static void main(String[] args) {
		// char占用2个字节, 字面量使用两个''来包围
		char c1 = 'a'; // 根据字符找到对应的unicode码值, 然后把码值这个整数保存在c1变量中
		char c2 = 'b';
		char c3 = 'A';
		char c4 = '2';
		char c5 = '我';
		char c6 = '你';

		System.out.println(c1); // 打印时,因为它是字符型, 所以要根据码值97找到相应的字符
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		System.out.println((int)c1); // 直接打印字符的码值
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		System.out.println((int)c5);
		System.out.println((int)c6);

		char c7 = 100; // 直接可以使用整数赋值
		System.out.println(c7);

		c7 = (char)(c7 + 20000);
		System.out.println(c7);

		// 练习 : 输出你的名字的unicode码值. 把你的姓+500, 打印输出.


	}
}