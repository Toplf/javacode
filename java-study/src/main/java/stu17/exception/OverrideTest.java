package stu17.exception;

import java.io.EOFException;
import java.io.IOException;

class A {
	
	protected Object test(int a) {
		return null;
	}
	
	public static void test2() {
	}
}

class B extends A {
	
	@Override
	public String test(int b) throws Error {
		return null;
	}
	
	public static void test2() {
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		A a = new B();
		a.test(10);
	}
}
