package stu16.innerclass;

import org.omg.CORBA.PUBLIC_MEMBER;
import stu16.interfacetest.Student;


/**
 * 	内部类
 * 		1) 成员内部类 : 在类中方法外声明的内部类
 * 			1) 普通内部类 没有static修饰 依赖外部类的对象
 * 				适用于内部类和外部类频繁交互, 比对象关联更方便, 更好用.
 *
 * 			2) 嵌套类	 有static修饰 依赖外部类
 * 		2) 局部内部类 : 在方法中声明的内部类
 * 			1) 普通局部内部类
 * 			2) 匿名内部类(超重点)
 *
 */
class Outer {

	private int id = 10;

	// 普通内部类
	public class Inner1 {

		private int id = 100;

		public void inner1Test() {
			System.out.println(Inner1.this.id);
			System.out.println(Outer.this.id);
		}

	}

	public void outerTest1() {
		Inner1 inner1 = new Inner1();
		inner1.inner1Test();
	}

	// 嵌套类
	static class Inner2 {

		public static String name = "Inner2";
		public static void staticTest() {
			System.out.println("inner static test...");
		}

		private int age;

		public Inner2(int age) {
			this.age = age;
		}

		public void inner2Test() {
			System.out.println("inner2Test");
		}
	}
}

interface I1 {
	void test1();
}


public class InnerClassTest {

	public static void main(String[] args) {
		// 匿名内部类, 因为没有类名, 所以不能声明完再创建对象, 必须在声明的同时就创建对象
		// 匿名内部类主要和接口配合.
		I1 i1 = new I1() { // 只能创建一个对象, 并且必须多态引用.
			// 类体的部分就是接口的实现子类的类体
			@Override
			public void test1() {
				System.out.println("匿名内部类的实现方法体");
			}
		};
		i1.test1();

		//new InnerClassTest$1();

		new I1() {
			@Override
			public void test1() {
				System.out.println("第二个匿名内部类实现");
			}
		}.test1(); // 匿名类的匿名对象, 适用于一次性调用

		Student student = new Student() {}; // 此时创建的不是学生类的对象, 而是学生的匿名子类对象
		System.out.println(student.getClass());
	}

	public static void main4(String[] args) {
		// 在方法中声明的内部类, 普通局部内部类
		class LocalClass1 {
			private int id;
			private String name;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			@Override
			public String toString() {
				return "LocalClass1 [id=" + id + ", name=" + name + "]";
			}
		};

		LocalClass1 localClass1 = new LocalClass1();
		System.out.println(localClass1.getName());
		System.out.println(localClass1);
	}

	public static void main3(String[] args) {
		Outer.Inner2.staticTest();
		Outer.Inner2 oi2 = new Outer.Inner2(30); // 直接创建对象
		oi2.inner2Test();
	}

	public static void main2(String[] args) {
		Outer outer = new Outer();
		//outer.outerTest1();
		Outer.Inner1 oi1 = outer.new Inner1();//new Outer.Inner1();
		oi1.inner1Test();
	}
}
