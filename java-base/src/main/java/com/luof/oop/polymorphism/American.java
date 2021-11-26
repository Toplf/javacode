package com.luof.oop.polymorphism;

public class American extends Person {

	private boolean hasGun;

	public American() {
		super();
	}

	public American(String name, int age, String gender, boolean hasGun) {
		super(name, age, gender);
		this.hasGun = hasGun;
	}

	public void setHasGun(boolean hasGun) {
		this.hasGun = hasGun;
	}

	public boolean isHasGun() {
		return hasGun;
	}

	@Override
	public String say() {
		return super.say() + ", 有枪 : " + hasGun;
	}

	@Override
	public void sayHello() {
		System.out.println("how are you?");
	}

	public void christmas() {
		System.out.println("merry chrimstmas!!");
	}
}
