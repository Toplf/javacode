package stu14.statictest;

public class FrockTest {

	public static void main(String[] args) {
		System.out.println(Frock.getNextNum());
		System.out.println(Frock.getNextNum());

		Frock frock1 = new Frock(190, "白色", 300);
		Frock frock2 = new Frock(180, "黑色", 200);
		Frock frock3 = new Frock(160, "红色", 400);

		System.out.println(frock1);
		System.out.println(frock2);
		System.out.println(frock3);
	}
}
