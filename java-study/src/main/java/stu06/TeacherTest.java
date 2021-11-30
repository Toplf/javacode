package stu06;

class TeacherTest4 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher(); // t1是引用变量, 其中保存的是对象的地址.
		t1.name = "佟刚";
		t1.age = 40;
		t1.gender = "男";

		System.out.println(t1.say());

		Teacher t2 = new Teacher();
		t2.name = "程程";
		t2.age = 18;
		t2.gender = "女";

		System.out.println(t2.say());

		System.out.println("*****************************");

		// 交换引用
		Teacher tmp = t1;
		t1 = t2;
		t2 = tmp;

		System.out.println(t1.say());
		System.out.println(t2.say());

	}
}

class TeacherTest3 {


	public static void main(String[] args) {
		Teacher t1 = new Teacher(); // t1是引用变量, 其中保存的是对象的地址.
		t1.name = "佟刚";
		t1.age = 40;
		t1.gender = "男";

		System.out.println(t1.say());

		Teacher t2 = new Teacher();
		t2.name = "程程";
		t2.age = 18;
		t2.gender = "女";

		System.out.println(t2.say());

		//t1 = null; 这个操作也会引起t1原来指向的对象变成垃圾对象.
		t1 = t2; // t2中的地址值写入了t1引用变量, t1原来指向的对象将不再有引用指向了, 它将变成垃圾对象, 会被GC清理.

		t1.age = 10; // 虽然是通过t1修改对象的属性值, 但是通过t2也可以看到对象实体的变化.
		System.out.println(t2.say());

	}
}

class TeacherTest2 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.name = "佟刚";
		t1.age = 40;
		t1.gender = "男";

		String str = t1.say();
		System.out.println(str);

		Teacher t2 = new Teacher();
		t2.name = "程程";
		t2.age = 18;
		t2.gender = "女";

		System.out.println(t2.say());


		System.out.println("****************************");
		t1.age = 30; // 属性值的修改
		t2.age = 20;

		System.out.println(t1.say());
		System.out.println(t2.say());
	}
}

public class TeacherTest {

	public static void main(String[] args) {
		// 类已经就绪了
		// 依据类模板创建对象
		Teacher t = new Teacher();
		t.name = "佟刚";
		t.age = 40;
		t.gender = "男";

		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println(t.gender);

		t.lesson();
		t.eat("包子");
		String s = t.say();
		System.out.println(s);

	}
}