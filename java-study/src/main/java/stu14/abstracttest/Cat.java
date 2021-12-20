package stu14.abstracttest;

public class Cat extends Pet {

	private String color;

	public Cat() {
	}

	public Cat(String name, int age, double weight, String color) {
		super(name, age, weight);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ", color : " + color;
	}

	@Override
	public void speak() { // 实现 implement, 方法在父类中是抽象的, 到了子位具体化的过程.
		System.out.println("喵喵喵....");
	}

	@Override
	public void eat() {
		System.out.println("小猫吃鱼");
	}

}
