package com.luof.oop.polymorphism;

/**
 * 子类继承父类所有成员, 不包括构造器
 */
public class Chinese extends Person {

	private String shuxiang;

	public Chinese() {
		super();
	}

	public Chinese(String name, int age, String gender, String shuxiang) {
		super(name, age, gender);
		this.shuxiang = shuxiang;
	}

	public String getShuxiang() {
		return shuxiang;
	}

	public void setShuxiang(String shuxiang) {
		this.shuxiang = shuxiang;
	}

	@Override
	public String say() {
		return super.say() + ", 属相 : " + shuxiang;
	}

	@Override
	public void sayHello() {
		System.out.println("吃了吗?");
	}

	public void spring() {
		System.out.println("过大年, 快过年了..好高兴");
	}

}