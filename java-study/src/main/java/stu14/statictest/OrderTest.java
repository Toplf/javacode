package stu14.statictest;

// 底层代码会把 非静态语句块, 显式赋值, 和构造器 合体, 形成一个特殊方法<init>
// 会把所有static{}和静态属性的显式同伴 合体, 形成一个特殊方法<cinit>
class Base {
	{
		System.out.println("Base {}"); // 1
	}
	static {
		System.out.println("Base static {}"); // 2
	}
	public Base() {
		System.out.println("Base Base()"); // 3
	}
}

class Sub extends Base {
	{
		System.out.println("Sub {}"); // 4
	}

	static {
		System.out.println("Sub static {}"); // 5
	}

	public Sub() {
		System.out.println("Sub Sub()"); // 6
	}
}


public class OrderTest {

	public static void main(String[] args) {
		new Sub(); // 2 5 1 3 4 6
	}
}
