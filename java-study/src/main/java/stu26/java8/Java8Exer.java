package stu26.java8;

import org.junit.Test;

@FunctionalInterface
interface IA {
	int hello(String string);
}

public class Java8Exer {

	@Test
	public void test2() {
		IA i1 = new IA() {
			@Override
			public int hello(String string) {
				return Integer.parseInt(string);
			}
		};
		int n1 = i1.hello("9328");
		System.out.println(n1);

		IA i2 =  s -> Integer.parseInt(s);
		int n2 = i2.hello("544");
		System.out.println(n2);
	}

	@Test
	public void test1() {
		IA i1 = new IA() {
			@Override
			public int hello(String string) {
				return Integer.parseInt(string);
			}
		};
		int n1 = i1.hello("9328");
		System.out.println(n1);

		IA i2 = (String string) -> {return Integer.parseInt(string);};
		int n2 = i2.hello("544");
		System.out.println(n2);
	}
}
