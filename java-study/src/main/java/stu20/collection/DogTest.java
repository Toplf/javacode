package stu20.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Dog implements Comparable {

	private String name;
	private int age;
	private double weight;

	public Dog() {
	}

	public Dog(String name, int age, double weight) {
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
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Dog) {
			return this.age - ((Dog)o).age;
		}
		throw new RuntimeException("对象不可比");
	}

}

class DogComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Dog && o2 instanceof Dog) {
			return (int)(((Dog)o1).getWeight() - ((Dog)o2).getWeight());
		}
		throw new RuntimeException("对象不可比");
	}

}

public class DogTest {

	public static void main(String[] args) {
		Set set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Dog && o2 instanceof Dog) {
					return ((Dog)o1).getName().compareTo(((Dog)o2).getName());
				}
				throw new RuntimeException("对象不可比");
			}
		}); // 定制排序

		Dog dog1 = new Dog("小黑", 4, 20);
		Dog dog2 = new Dog("小黄", 1, 15);
		Dog dog3 = new Dog("小汪", 5, 25);
		Dog dog4 = new Dog("旺财", 3, 10);

		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		set.add(dog4);

		for (Object object : set) {
			System.out.println(object);
		}
	}

	public static void main2(String[] args) {
		Set set = new TreeSet(); // 内部要自然排序

		Dog dog1 = new Dog("小黑", 4, 20);
		Dog dog2 = new Dog("小黄", 1, 15);
		Dog dog3 = new Dog("小汪", 5, 5);
		Dog dog4 = new Dog("旺财", 3, 10);

		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		set.add(dog4);

		for (Object object : set) {
			System.out.println(object);
		}
	}

	public static void main1(String[] args) {
		Set set = new HashSet();

		Dog dog1 = new Dog("小黑", 4, 20);
		Dog dog2 = new Dog("小黄", 1, 15);
		Dog dog3 = new Dog("小汪", 5, 5);
		Dog dog4 = new Dog("旺财", 3, 10);
		Dog dog5 = new Dog("旺财", 3, 10);

		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		set.add(dog4);
		set.add(dog5);

		for (Object object : set) {
			System.out.println(object);
		}
	}
}
