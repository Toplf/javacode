package stu19.wrapper;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void test2() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j); // false

		Integer m = 1; // 自动装箱, Integer.valueOf(1);
		Integer n = 1; // 如果装箱值在-128~127之间时, 会取缓冲对象数组中的一个
		System.out.println(m == n);

		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);
	}

	@Test
	public void test1() {
		int n = 200;
		Integer obj1 = new Integer(n);
		Integer obj2 = n;

		System.out.println(obj1 == obj2);

		// 拆箱
		int v1 = obj1.intValue();
	}
}
