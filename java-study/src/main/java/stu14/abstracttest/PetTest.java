package stu14.abstracttest;

public class PetTest {

	public static void main(String[] args) {
		//Pet pet = new Pet();
		Pet pet = new Cat("小黄", 2, 5, "黄色");
		pet.speak(); // 虚拟方法调用
		pet.eat();
	}
}

