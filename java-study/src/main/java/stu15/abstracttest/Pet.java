package stu15.abstracttest;

/**
 * 具体类 : 某种事物的抽象定义
 * 抽象类 : 某类的多种不同事物的抽象定义
 * 		抽象类可以包含抽象方法, 抽象方法 : 只有声明 没有方法体.
 * 抽象方法 : 应该具有的行为, 但是具体怎么行为又不确定.
 *
 * 抽象类可以包含
 * 		属性
 * 		方法
 * 		构造器
 * 		抽象方法
 */
public abstract class Pet {

	private String name;
	private int age;
	private double weight;

	public Pet() {
	}

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
