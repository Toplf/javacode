package stu14.abstracttest;

public class FrockTest {

	public static void main(String[] args) {
		//new Frock();
		Frock frock = new Shirt(180, "黑色", 500);
		System.out.println(frock.calcArea());
	}
}
