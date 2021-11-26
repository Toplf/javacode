package com.luof.oop.polymorphism;

public class NotePad extends Computer {

	int satelite;

	public NotePad(double cpu, int memory, int disk, double price, int satelite) {
		super(cpu, memory, disk, price);
		this.satelite = satelite;
	}

	public void navigate() {
		System.out.println("使用平板导航, CPU : " + getCpu());
	}

	@Override
	public String getDetails() {
		return super.getDetails() + ", 卫星 : " + satelite;
	}
}