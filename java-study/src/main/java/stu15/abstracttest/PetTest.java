package stu15.abstracttest;

public class PetTest {

	public static void main(String[] args) {
		Pet pet = new Dog("ะกอ๔", 2, 8, "อมนท");
		pet.speak();
		pet.eat();

		System.out.println(pet);
	}
}
