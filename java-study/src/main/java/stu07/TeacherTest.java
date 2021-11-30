package stu07;
class TeacherTest7 {

	public static void main(String[] args) {
		Teacher t = new Teacher("佟刚", 40, "男");
		Computer com = new Computer(3.8, 16);
		t.lesson(com); // 对象的传递
	}
}


class TeacherTest6 {

	public static void test1(int n) {
		n++;
		System.out.println(n);
	}

	public static void test2(Teacher tt) { // 对象的传递, 本质上是传递的地址..
		//tt = new Teacher();
		System.out.println("test2.. " + tt.say());
		tt.setAge(10);
		System.out.println("test2.. " + tt.say()); // 10
	}

	public static void main(String[] args) {
		Teacher t = new Teacher("佟刚", 40, "男");
		System.out.println(t.say());

		int n = 10;
		test1(n);
		System.out.println("main n : " + n);

		test2(t);
		System.out.println(t.say()); // ?
	}
}

class TeacherTest5 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher(); // 调用简单
		System.out.println(t1.say()); // 谁调用方法 , 谁就是this

		Teacher t2 = new Teacher("明哥", 30, "男"); // 一步到位
		System.out.println(t2.say());
	}
}

class TeacherTest4 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher(); // 在创建对象时会调用到类的无参构造器
		System.out.println(t1.say());

		//Teacher t2 = new Teacher("佟刚", 40); // 有参构造
		//System.out.println(t2.say());

		Teacher t3 = new Teacher("李明", 30, "男");
		System.out.println(t3.say());
	}
}

/*
class TeacherTest3 {

	public static void main(String[] args) {
		Teacher t = new Teacher(); // 在创建对象时会调用到类的无参构造器
		System.out.println(t.say());

		//t.name = "程程"; // name属性一旦变成了私有的, 在这里就无法直接访问了.
		// 想办法间接访问属性, 通过对象的公共方法来完成
		t.setName("程程");

		//t.age = 20000;
		t.setAge(20);

		//t.gender = "女";
		t.setGender("女");

		//System.out.println(t.name);
		System.out.println(t.getName());
		//System.out.println(t.age);
		System.out.println(t.getAge());
		//System.out.println(t.gender);
		System.out.println(t.getGender());

		System.out.println(t.say());
	}
}


class TeacherTest2 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		System.out.println(t1.say());

		Teacher t2 = new Teacher();
		t2.name = "程程";
		t2.age = 20;
		t2.gender = "女";
		System.out.println(t2.say());
	}
}

public class TeacherTest {

	public static void main(String[] args) {
		// 创建对象
		Teacher t1 = new Teacher();
		t1.name = "佟刚"; // 对象属性 必须依赖 对象的存在而存在
		t1.age = 40;
		t1.gender = "男";

		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.gender);

		t1.lesson();
		t1.eat("鸡蛋");

		System.out.println(t1.say());

		Teacher t2 = new Teacher();
		t2.name = "程程";
		t2.age = 20;
		t2.gender = "女";

		t2.lesson();
		t2.eat("包子");
		System.out.println(t2.say());
	}
}
*/