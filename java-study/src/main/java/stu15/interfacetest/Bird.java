package stu15.interfacetest;

import java.io.Serializable;

// 子类同时继承父类并实现接口, 间接的实现了多继承, 子类可以多实现
// 和父类的关系更近一些, 和接口的关系稍远
public class Bird extends Pet implements Flyer, Serializable, Runnable {

	private int flySpeed;

	public Bird() {
		super();
	}

	public Bird(String name, int age, double weight, int flySpeed) {
		super(name, age, weight);
		this.flySpeed = flySpeed;
	}

	public int getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(int flySpeed) {
		this.flySpeed = flySpeed;
	}

	@Override
	public String toString() {
		return super.toString() + ", 飞行速度 : " + flySpeed;
	}

	@Override
	public void speak() {
		System.out.println("吱吱吱....");
	}

	@Override
	public void eat() {
		System.out.println("小鸟吃虫虫");
	}

	@Override
	public void takeOff() {
		System.out.println("小鸟起飞, so easy");
	}

	@Override
	public void fly() {
		System.out.println("自由飞");
	}

	@Override
	public void land() {
		System.out.println("我喜欢电线杆");
	}

	@Override
	public void run() {
	}
}
