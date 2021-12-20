package stu15.interfacetest;

public class FlyerTest {

	public static void main(String[] args) {
		Pet pet = new Bird("小飞", 2, 0.2, 30);
		pet.speak();
		pet.eat();

		Flyer flyer = (Flyer)pet; // 多态 : 把子类对象当作父类类型的对象来用.
		flyer.fly();
	}

	public static void main2(String[] args) {
		Pet pet = new Bird("小飞", 2, 0.2, 30);
		pet.speak();
		pet.eat();

		//Flyer flyer = pet;
		//flyer.takeOff();
		//flyer.land();
		//flyer.fly();
	}

	public static void main1(String[] args) {
		//Flyer flyer = new Flyer();
		Flyer flyer = new Plane();
		flyer.takeOff();
		flyer.fly();
		flyer.land();
	}
}
