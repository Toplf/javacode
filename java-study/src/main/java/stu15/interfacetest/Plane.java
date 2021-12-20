package stu15.interfacetest;

public class Plane implements Flyer { // implements是实现的意思, Plane就相当于是子类, 接口相当于是父类

	public void takeOff() {
		System.out.println("飞机要起飞了, 推背感不错");
	}

	public void fly() {
		System.out.println("飞机在云上, 万一掉下来不好");
	}

	public void land() {
		System.out.println("飞机要着陆, 据说着陆更危险");
	}

	public void addOil() {
		System.out.println("要加油");
	}
}
