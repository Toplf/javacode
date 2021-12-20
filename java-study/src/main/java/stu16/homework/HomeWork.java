package stu16.homework;

//定义一个接口用来实现两个对象的比较。
interface CompareObject {
	public int compareTo(Object o);   //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
}

/*
定义一个Circle类。
*/
class Circle {

	private int radius;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

/*
定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小。
定义一个测试类TestInterface，创建两个ComparableCircle对象，调用compareTo方法比较两个类的半径大小。
*/
class ComparableCircle extends Circle implements CompareObject {

	public ComparableCircle() {
		super();
	}

	public ComparableCircle(int radius) {
		super(radius);
	}

	@Override
	public int compareTo(Object o) { //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
		if (o instanceof ComparableCircle) {
			ComparableCircle circle2 = (ComparableCircle)o;
			if (this.getRadius() == circle2.getRadius()) {
				return 0;
			} else if (this.getRadius() > circle2.getRadius()) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0x80000000;
	}

}

public class HomeWork {

	public static void main(String[] args) {
		CompareObject c1 = new ComparableCircle(200);
		CompareObject c2 = new ComparableCircle(200);
		int n = c1.compareTo(c2);
		if (n == 0x80000000) {
			System.out.println("对象不可比");
		} else {
			if (n > 0) {//if (n == 1) { // 以接口为准
				System.out.println("左大右小");
			} else if (n < 0) {
				System.out.println("左小右大");
			} else {
				System.out.println("相等");
			}
		}
	}
}

