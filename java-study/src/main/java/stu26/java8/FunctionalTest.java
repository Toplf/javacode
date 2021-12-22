package stu26.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;
import stu26.javabean.Student;
import stu26.javabean.StudentData;


/**
 * 函数式接口
 * 		只有一个抽象方法的接口, 可以用@FunctionalInterface修饰
 *
 * Consumer<T> 消费器, 作用是消费一个T类型的对象, 并没有返回.
 * 		void accept(T t) : 有输入无输出
 *
 * Supplier<T> 供给器, 作用是供给一个T类型的对象, 不需要参数.
 * 		T get() : 无输入有输出
 *
 * Function<T, R> 转换器, 作用是输入一个T类型对象, 经过处理, 返回的是R类型对象.
 * 		R apply(T t) : 有输入有输出
 *
 * Predicate<T> 判定器, 作用是输入一个T类型对象, 经过某种判断, 返回true或false
 * 		boolean test(T t) : 有输入有固定输出布尔
 *
 * 方法引用 : 接口中的抽象方法的模式(输入和输出) 和 Lambda体中的方法调用是一致时, 就可以简化写法.
 * 类或对象 :: 方法名
 *
 */

public class FunctionalTest {

	@Test
	public void exer22() {
		//Supplier<Student> supplier2 = () -> new Student();
		Supplier<Student> supplier2 = Student::new;
		System.out.println(supplier2.get());
	}

	@Test
	public void test42() {
		//Function<Integer, String> function2 = t -> String.valueOf(t);
		Function<Integer, String> function2 = String::valueOf;
		System.out.println(function2.apply(1112));
	}

	@Test
	public void test32() {
		//Supplier<Double> supplier2 = () -> Math.random();
		Supplier<Double> supplier2 = Math::random;
		System.out.println(supplier2.get());
	}

	@Test
	public void test12() {
		//Consumer<String> consumer2 = t -> System.out.println(t);
		Consumer<String> consumer2 = System.out::println;
		consumer2.accept("lkjxlkcjccc");
	}

	// 写一个判定器, 判断一个学生是否及格
	@Test
	public void exer4() {
		Predicate<Student> predicate1 = new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getScore() >= 60;
			}
		};
		Student student = StudentData.getList().get(0);
		boolean test = predicate1.test(student);
		System.out.println(test);

		Predicate<Student> predicate2 = t -> t.getScore() >= 60;
		System.out.println(predicate2.test(student));
	}

	@Test
	public void test5() {
		Predicate<Integer> predicate1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
		};
		boolean test = predicate1.test(83);
		System.out.println(test);

		Predicate<Integer> predicate2 = t -> t % 2 == 0;
		System.out.println(predicate2.test(20));
	}

	// 写一个转换器, 把学生对象转换成字符串, 内容是姓名+分数
	@Test
	public void exer3() {
		Function<Student, String> function1 = new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName() + ":" + t.getScore();
			}
		};
		String apply = function1.apply(new Student(2, "小刚", 5, 80));
		System.out.println(apply);

		Function<Student, String> function2 = t -> t.getName() + ":" + t.getScore();
		System.out.println(function2.apply(new Student(1, "小花", 2, 100)));
	}

	@Test
	public void test4() {
		Function<Integer, String> function1 = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return String.valueOf(t);
			}
		};

		String apply = function1.apply(9238);
		System.out.println(apply);

		Function<Integer, String> function2 = t -> String.valueOf(t);
		System.out.println(function2.apply(1112));
	}

	// 写一个供给器, 每调用一次供给一个学生对象
	@Test
	public void exer2() {
		Supplier<Student> supplier1 = new Supplier<Student>() {
			@Override
			public Student get() {
				return new Student();
			}
		};
		Student student = supplier1.get();
		System.out.println(student);

		Supplier<Student> supplier2 = () -> new Student();
		System.out.println(supplier2.get());
	}

	@Test
	public void test3() {
		Supplier<Double> supplier = new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
		};
		System.out.println(supplier.get());

		Supplier<Double> supplier2 = () -> Math.random();
		System.out.println(supplier2.get());
	}

	@Test
	public void test2() {
		Supplier<Integer> supplier1 = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 100;
			}
		};
		Integer integer = supplier1.get();
		System.out.println(integer);

		Supplier<Integer> supplier2 = () -> 100;
		Integer integer2 = supplier2.get();
		System.out.println(integer2);
	}

	// 写一个消费器, 消费一个Student对象.
	@Test
	public void exer1() {
		Consumer<Student> consumer1 = new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t);
			}
		};
		consumer1.accept(new Student());

		Consumer<Student> consumer2 = t -> System.out.println(t);
		consumer2.accept(new Student(1, "小花", 2, 50));
	}

	@Test
	public void test1() {
		Consumer<String> consumer1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		consumer1.accept("alsdkjfalksdjf");

		Consumer<String> consumer2 = t -> System.out.println(t);
		consumer2.accept("lkjxlkcjccc");
	}
}