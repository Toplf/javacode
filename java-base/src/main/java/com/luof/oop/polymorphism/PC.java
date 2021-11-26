package com.luof.oop.polymorphism;

public class PC extends Computer {

	String keyboard;

	public PC() {
	}

	public PC(double cpu, int memory, int disk, double price, String keyboard) {
		super(cpu, memory, disk, price);
		this.keyboard = keyboard;
	}

	public void code() {
		System.out.println("使用PC写代码, 内存 : " + getMemory()); // 成员互访
	}

	@Override
	public String getDetails() {
		return super.getDetails() + ", 键盘 : " + keyboard;
	}
}
