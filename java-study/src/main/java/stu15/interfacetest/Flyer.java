package stu15.interfacetest;

/**
 * 	具体类 : 某种事物抽象定义
 * 	抽象类 : 某类不同种事物抽象定义
 * 	接口    : 不同类不同种事物的共同行为抽象定义(方法)
 * 		接口中的方法都是公共抽象方法 和 全局常量(public static final)
 *
 * 	接口表达的是能力, 如果某类具有了这样的能力, 也可以认为这个类达到了接口的标准和规范.
 * 	接口规范的目的是越多的子类实现越好.
 */
public interface Flyer {

	public static final int num = 10;

	//public abstract void takeOff();
	void takeOff();

	void fly();

	void land();

}
