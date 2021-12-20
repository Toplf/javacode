package stu14.abstracttest;

/**
 * 具体类 : 某种事物的抽象定义, 不可以包含抽象方法
 * 抽象类 : 某类不同种事物的统一抽象定义, 抽象类使用abstract修饰 可以抽象类可以包含抽象方法
 *
 * 抽象方法 : 只有方法签名, 没有方法体. 不能执行. 只是表明具有某种行为
 *
 * 抽象类不能创建实例.
 *
 * 抽象类可以包含属性, 方法, 构造器和抽象方法
 *
 * 如果一个类包含了抽象方法, 这个类必须是抽象类.
 */
public abstract class Pet {

	private String name;
	private int age;
	private double weight;

	public Pet() {}

	public Pet(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public abstract void speak();

	public abstract void eat();

}
