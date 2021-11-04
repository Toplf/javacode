package com.luof.base.type;

public class BooleanTest {

	public static void main(String[] args) {
		//boolean 占用一个字节, 并且只允许使用true和false赋值, 底层使用1表示true,0表示false
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		// boolean不可以参与强制类型转换.
		// boolean b4 = (boolean)1;
	}
}