package stu21.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import stu21.collection.Teacher;

/**
 * 泛型要解决类型安全问题
 */
class Person<X> { // X表示某种类型, X在这里称为泛型的类型参数(是一个形参)
	// X类型的真实类型会在创建对象时确定下来, 隶属于对象的存在而存在.

	private String name;
	private X info;

	public Person() {
	}

	public Person(String name, X info) {
		this.name = name;
		this.info = info;
	}

	public X getInfo() {
		return info;
	}

	public void setInfo(X info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", info=" + info + "]";
	}

	/*在静态方法中不可以使用泛型类中的泛型
	public static void test(X x) {
	}
	*/
}

// 泛型和继承之间的关系
class A<Y> {
	private Y y;
	public Y getY() {
		return y;
	}
}

class B1 extends A {} // 子类中没有处理父类的泛型. 泛型类型就是类型最模糊的Object, 这种不好

class B2 extends A<Integer> {} // 子类在继承时把父类的泛型写死了 ,  这是最简单
class B3 extends A<Teacher> {} // 在创建子类对象后, 其泛型是固定的.

class B4<Y> extends A<Y> {} // 子类在继承时仍然继续泛型, 这是最灵活

class GenericMethod<T> {

	public void test(T t) {
	}

	//public Object get(Object obj) {
	// 泛型方法中必须传入泛型类型的参数, 如果不传泛型永远无法确定.
	// 这个泛型类型由实参的类型来决定, 所以它是和方法的某次调用相关
	public static <E> E get(E e) { // E表示只可以在此方法中使用的某种类型
		return null;
	}

}

public class GenericTest {

	@Test
	public void test5() {
		//Object object = GenericMethod.get();
		String string = GenericMethod.get("abc"); // 泛型方法必须通过实参来告诉方法, 泛型的具体类型是什么
		Integer integer = GenericMethod.get(200);
		Boolean boolean1 = GenericMethod.get(false);
		Object object = GenericMethod.get(null); // 如果实参是null, 将会导致泛型类型无法感知!!!
	}

	@Test
	public void test4() {
		B1 b1 = new B1();
		Object y = b1.getY();

		Integer y2 = new B2().getY();
		Integer y3 = new B2().getY();

		Teacher y4 = new B3().getY();

		B4 b4 = new B4();
		Object y5 = b4.getY();
		Double y6 = new B4<Double>().getY();
		String y7 = new B4<String>().getY();
	}

	@Test
	public void test3() {
		Person<Integer> person1 = new Person<Integer>("张三", 20); // 使用了泛型后, 类型就安全了.
		Integer info1 = person1.getInfo(); // 获取到的属性也安全了, 清晰了.

		Person<Boolean> person2 = new Person<Boolean>("李四", true);
		Boolean info2 = person2.getInfo();

		Person person3 = new Person("王五", 3.22);
		Object info3 = person3.getInfo();
	}

	@Test
	public void test2() {
		Person person1 = new Person("张三", 30);
		Object info1 = person1.getInfo();

		Person person2 = new Person("李四", "女");
		Object info2 = person2.getInfo();
	}

	@Test
	public void test1() {
		List list1 = new ArrayList();
		list1.add(1);
		list1.add("abc");

		Object object = list1.get(0);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		//list2.add("abc");

		List<Object> list3 = new ArrayList<Object>();
	}
}
