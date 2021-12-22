package stu26.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

// java8中允许接口中有具体方法, 一种是静态, 另一种是缺省
// 对接口的升级不希望影响到所有子类, 添加缺省方法.

// Lambda表达式可以代替匿名内部类对象
// 简化写法, 可以把new xxx() {}, 也可以把方法中的修饰符, 返回值类型, 方法名 全部省略
// 最终只保留了 参数列表 和 方法体
// 类型推断 : List<Integer> list = new ArrayList<>(); 根据左侧的类型可以推断右侧的真实类型
// 基于编译器可以类型推断, 不需要再new 接口, 因为在接口中抽象方法的签名一目了然, 完全可以推断.
// Lambda只适用于接口中只有一个抽象方法的接口.

// 最终只保留了 参数列表 和 方法体
// 面向函数编程, 只关注函数的输入和输出, 其他的不管
// 因为左侧直接拿到了接口, 所以方法的参数类型可以省略
// 方法体的{}也省略, return也省略, 如果只有一个参数, 参数列表的()也省略

//Lambda只适用于接口中只有一个抽象方法的接口, 并且方法中就一条语句.
interface I1 {
	public static void test() {
		System.out.println("test");
	}
	void test1();
	//void test2(); 添加抽象方法的代价太大, 需要所有子类全部再实现它.
	public default void test2() { // 缺省方法, 默认方法, 子类可以选择直接继承使用它, 也可以重写它.
		System.out.println("test2");
	}
}

public class Java8Test {

	@Test
	public void test3() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 50));
		}
		Comparator<Integer> comparator1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		Collections.sort(list, comparator1);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);

		//Comparator<Integer> comparator2 = (o1, o2) -> o2 - o1;
		Collections.sort(list, (o1, o2) -> o2 - o1);
		System.out.println(list);

	}

	@Test
	public void test2() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 50));
		}
		Comparator<Integer> comparator1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		Collections.sort(list, comparator1);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);

		Comparator<Integer> comparator2 = (Integer o1, Integer o2) -> {return o2 - o1;};
		Collections.sort(list, comparator2);
		System.out.println(list);

	}

	@Test
	public void test1() {
		I1 i1 = new I1() {
			@Override
			public void test1() {
				System.out.println("匿名内部类的test1");
			}
		};
		i1.test1();
		I1 i2 = () -> System.out.println("Lambda的test1...");
		i2.test1();
	}
}
