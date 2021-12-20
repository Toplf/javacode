package stu16.innerclass;

interface A {
	public abstract void fun1();
}

public class Outer2 {

	public static void main(String[] args) {
		new Outer2().callInner(new A() {
			// 接口是不能new但此处比较特殊是子类对象实现接口，只不过没有为对象取名
			@Override
			public void fun1() {
				System.out.println("implement for fun1");
			}
		});// 两步写成一步了
	}

	public void callInner(A a) {
		a.fun1();
	}
}