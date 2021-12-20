package stu15.innerclass;

/**
 * 内部类 : 把一个类定义在另一个类的内部, 后面的类称为外部类
 *
 * 内部分为 :
 * 		成员内部类 : 声明在类中方法外
 * 			没有被static修饰的称为普通内部类
 * 			被static修饰的内部类称为嵌套类
 * 		局部内部类 : 声明在方法中
 * 			普通用法 , 普通局部内部类
 * 			匿名内部类 (超重点)
 *
 */
class Outer {

	private int id = 10;
	private String name = "Outer.name";

	// 普通内部类, 隶属于外部类的对象的, 它的创建和使用也受外部类对象的限制.
	public class Inner1 {
		private int id = 100;
		public void inner1Test() {
			//System.out.println(id); // 和下面一样
			System.out.println(Inner1.this.id); // 内部类的this对象的属性
			System.out.println(Outer.this.id); // 外部类的this对象的属性
			System.out.println(name);
			outerTest2(); // 在内部类中可以随意使用外部类的成员.
		}
	}

	public void outerTest1() {
		Inner1 inner1 = this.new Inner1();
		inner1.inner1Test();
	}

	public void outerTest2() {
		System.out.println("outerTest2()...");
	}

	// 嵌套类
	public static class Inner2 {
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		//outer.outerTest1();
		// 直接创建内部类对象, 需要使用外部类对象.new
		Outer.Inner1 oi1 = outer.new Inner1();
		oi1.inner1Test();
	}
}
