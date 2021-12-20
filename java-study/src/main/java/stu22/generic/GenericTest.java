package stu22.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.experimental.max.MaxCore;

class Person<T> { // 在创建对象时由创建者告诉它是什么类型

	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public static <T> T test(T t) { // 在方法调用时, 由实参告诉它泛型类型
		return null;
	}
}

public class GenericTest {

	public Comparable max3(Collection<? extends Comparable> col) {
		Iterator<? extends Comparable> iterator = col.iterator();
		Comparable max = iterator.next();
		while (iterator.hasNext()) {
			Comparable next = iterator.next();
			if (next.compareTo(max) > 0) {
				max = next;
			}
		}
		return max;
	}

	@Test
	public void test11() {
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add((int)(Math.random() * 20));
		}
		System.out.println(list1);
		System.out.println(max3(list1));

		List<Double> list2 = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list2.add((Math.random() * 20));
		}
		System.out.println(list2);
		System.out.println(max3(list2));

		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set1.add((int)(Math.random() * 20));
		}
		System.out.println(set1);
		System.out.println(max3(set1));

		Set<String> set2 = new HashSet<String>();
		set2.add("yyy");
		set2.add("ccc");
		set2.add("aaa");
		set2.add("zz");
		set2.add("XX");
		set2.add("AA");
		set2.add("3242");

		System.out.println(set2);
		System.out.println(max3(set2));

	}

	public Number max2(Collection<? extends Number> col) {
		Iterator<? extends Number> iterator = col.iterator();
		Number max = iterator.next();
		while (iterator.hasNext()) {
			Number next = iterator.next();
			if (next.doubleValue() > max.doubleValue()) {
				max = next;
			}
		}
		return max;
	}

	@Test
	public void test10() {
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add((int)(Math.random() * 20));
		}
		System.out.println(list1);
		System.out.println(max2(list1));

		List<Double> list2 = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list2.add((Math.random() * 20));
		}
		System.out.println(list2);
		System.out.println(max2(list2));

		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set1.add((int)(Math.random() * 20));
		}
		System.out.println(set1);
		System.out.println(max2(set1));
	}

	public double max(List<? extends Number> list) {
		double max = list.get(0).doubleValue();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).doubleValue() > max) {
				max = list.get(i).doubleValue();
			}
		}
		return max;
	}

	@Test
	public void test9() {
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add((int)(Math.random() * 20));
		}
		System.out.println(list1);
		System.out.println(max(list1));

		List<Double> list2 = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list2.add((Math.random() * 20));
		}
		System.out.println(list2);
		System.out.println(max(list2));
	}

	// 通用的求和, 集合中保存的是Number及其未知子类, 防止集合添加元素, 使得集合的使用更安全
	public double sum(List<? extends Number> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).doubleValue();
		}
		return sum;
	}

	@Test
	public void test8() {
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add((int)(Math.random() * 20));
		}
		System.out.println(list1);
		System.out.println(sum(list1));

		List<Double> list2 = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list2.add((Math.random() * 20));
		}
		System.out.println(list2);
		System.out.println(sum(list2));
	}

	@Test
	public void test7() {
		// list1中可以保存的是Number和其未知父类的对象, Number对象可以添加
		List<? super Number> list1 = null;
		list1.add(3.22); // 可以适用于添加元素
		list1.add(300);

		Object object = list1.get(0); // 不适用于获取元素

		List<Integer> list0 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list0.add((int)(Math.random() * 20));
		}

		// list2中可以保存的是Number及其未知子类的对象
		List<? extends Number> list2 = list0;
		//list2.add(3); // 不适用添加元素, 不可以添加已知子类

		Number number = list2.get(0); // 适用于获取元素

	}

	public void travel(List<?> list) { // 方法的参数能有更好的兼容性
		for (Object object : list) {
			System.out.println(object);
		}
	}

	@Test
	public void test6() {
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add((int)(Math.random() * 20));
		}
		travel(list1);

		List<Double> list2 = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list2.add((Math.random() * 20));
		}
		travel(list2);
	}

	@Test
	public void test5() {
		// 这样写是不可以的.
		// 左边的list可以放任意Number及其子类对象
		// 右面的实体只能放整数
		// List<Number> list = new ArrayList<Integer>();
		// list.add(3.22); // 出现逻辑错误, 因为实体对象的集合只能放入整数.
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 20));
		}
		// 可以使用泛型通配符?
		// list2集合中可以保存任意未知类型对象
		List<?> list2 = list;
		list2.add(null); // 只允许添加没有类型信息的null

		Object object = list2.get(0); // 可以获取, 但是类型最模糊
	}

	@Test
	public void test4() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 20));
		}

		Object[] array = list.toArray(); // 集合 -> 数组
		//<T> T[] toArray(T[] a);
		Integer[] array2 = list.toArray(new Integer[1]); // 参数中必须传一个数组对象, 以便于方法在调用时能够感知到数组的类型.
		for (Integer integer : array2) {
			System.out.println(integer);
		}
	}

	@Test
	public void test3() {
		Integer test1 = Person.test(200);
		String test2 = Person.test("xxx");
		Boolean test3 = Person.test(false);
		Object test = Person.test(null);
	}

	@Test
	public void test2() {
		Person p1 = new Person(); // 泛型参数没有具体化
		p1.setInfo(200);
		Object info = p1.getInfo();

		Person<String> p2 = new Person<String>();
		String info2 = p2.getInfo();
		//p2.setInfo(200);
		p2.setInfo("abc");

		Person<Integer> p3 = new Person<Integer>();
		Integer info3 = p3.getInfo();

	}

	@Test
	public void test1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		//list.add("abc"); 添加时有数据保护
		Integer integer = list.get(0); // 获取时直接类型就位
		System.out.println(integer);
	}
}
