package com.luof.oop.polymorphism;

public class Beijing extends Chinese {

	public Beijing() {
		super();
	}

	public Beijing(String name, int age, String gender, String shuxiang) {
		super(name, age, gender, shuxiang);
	}

	@Override
	public void sayHello() {
		System.out.println("吃了您呐?");
	}
}
