package stu26.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import stu26.javabean.Student;
import stu26.javabean.StudentData;

/**
 * Stream : 
 * 	1) 不保存数据, 只负责处理数据
 * 	2) 处理数据不会造成原始数据的变化 , 每次处理都会产生新的流
 * 	3) 所有操作都是延迟执行的, 只有终止操作执行时才执行中间操作
 * 	4) 每个流只能"消费"一次, 消费过后就作废.
 * 	5) 单向, 一次性使用, 可以支持高并发...
 *
 * 典型的操作 :
 * 	1) 创建流(获取流)
 * 		1) 从集合获取流, 集合.stream();
 * 		2) 从数组获取流, Arrays.stream(Xxx[] arr);
 * 		3) 基于散数据, Stream.of(T... objs)
 * 		4) 使用供给器, 无限流
 * 	2) 中间操作, 多个中间操作就形成流水线, 是延迟执行的, 中间操作可以省略
 * 		***filter(Predicate p) : 让流中的每个对象都经过判定器, 如果结果为true留下, 如果是false丢弃. 产生新流
 * 		distinct(); 把流中的数据去重并产生新流, 依据对象的hashCode和equals
 * 		limit(long maxSize) 限制流中的最大数据量
 * 		skip(long n) 跳过前n个元素
 * 		***map(Function f) 让流中的每个对象都转换为新对象, 所以它的结果的流全变了.
 * 		sorted() 把流中的对象排序 , 自然排序
 * 		*sorted(Comparator c) 定制排序
 *
 * 	3) 终止操作, 一旦中止, 所有的中间操作就开始执行, 终止操作是必须的.
 * 		***forEach(Consumer c) : 让流中的每个对象都经过消费器消费一下.
 * 		findFirst() 返回流中的第一个对象
 * 		**count() 计数
 * 		**collect(采集器) 可以把结果集采集到一个新的容器中.
 * 		***reduce(BinaryOperator op) 把流中的对象两两处理最后产生一个结果
 *
 *	Optional是一容器, 里面放一个引用, 如果引用为空, 获取时直接抛异常.
 *	防止空指针.
 */
public class StreamTest {

	@Test
	public void exer6() {
		List<Student> collect = StudentData.getList()
		.stream()
		.distinct()
		.filter(t -> t.getGrade() == 3)
		.filter(t -> t.getScore() < 60).sorted((o1, o2) -> -(int)(o1.getScore() - o2.getScore()))
		.collect(Collectors.toList());
		for (Student student : collect) {
			System.out.println(student);
		}
	}

	// 找出全校最高分
	@Test
	public void exer5() {
		Optional<Double> reduce = StudentData.getList().stream().distinct().map(t -> t.getScore()).reduce((d1, d2) -> d1 > d2 ? d1 : d2);
		Double orElse = reduce.orElse((double) 999);
		System.out.println(orElse);
	}

	@Test
	public void exer4() {
		long count = StudentData.getList().stream().distinct().count();
		System.out.println(count);
	}

	@Test
	public void exer3() {
		Optional<Student> findFirst = StudentData.getList()
		.stream()
		.distinct()
		.filter(t -> t.getGrade() == 4)
		.filter(t -> t.getScore() < 60).sorted((o1, o2) -> -(int)(o1.getScore() - o2.getScore()))
		.limit(2).findFirst();
		//Student student = findFirst.get();
		Student student = findFirst.orElse(new Student()); // 最大化减少空指针
		System.out.println(student);
	}

	// 3年级没有及格的同学倒序, 取出前2个.
	@Test
	public void exer2() {
		StudentData.getList()
		.stream()
		.distinct()
		.filter(t -> t.getGrade() == 3)
		.filter(t -> t.getScore() < 60).sorted((o1, o2) -> -(int)(o1.getScore() - o2.getScore()))
		.limit(2).forEach(System.out::println);
	}

	@Test
	public void test9() {
		StudentData.getList().stream().distinct().sorted((t1, t2) -> (int)(t1.getScore() - t2.getScore())).forEach(System.out::println);
	}

	@Test
	public void test8() {
		StudentData.getList().stream().distinct().map(t -> t.getScore()).forEach(System.out::println);
	}

	@Test
	public void Test7() {
		// 第6个到第10个
		StudentData.getList().stream().distinct().skip(10).limit(5).forEach(System.out::println);
	}

	// 找出5年级姓张的同学
	@Test
	public void exer1() {
		List<Student> list = StudentData.getList();
		list.stream().filter(t -> t.getGrade() == 5).filter(t -> t.getName().startsWith("张")).forEach(System.out::println);
	}

	@Test
	public void test62() {
		List<Student> list = StudentData.getList();
		list.stream().filter(t -> t.getGrade() == 3).filter(t -> t.getScore() >= 60).forEach(System.out::println);
	}

	@Test
	public void test6() {
		List<Student> list = StudentData.getList();
		Stream<Student> stream = list.stream();
		Stream<Student> stream2 = stream.filter(t -> t.getGrade() == 3);
		Stream<Student> stream3 = stream2.filter(t -> t.getScore() >= 60);
		stream3.forEach(System.out::println);
	}

	@Test
	public void test5() {
		Stream.generate(Math::random).limit(10).forEach(System.out::println);// 无限流
	}

	@Test
	public void test4() {
		Stream<Integer> generate = Stream.generate(() -> 200); // 无限流
		generate.forEach(System.out::println);
	}

	@Test
	public void test3() {
		Stream<Number> of = Stream.of(3.22, 9.33, 4.88, 4.2, 8, 9);
		of.forEach(System.out::println);
	}

	@Test
	public void test2() {
		String[] arr = {"kjsf", "qqa", "cv", "XXX"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
	}

	@Test
	public void test1() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 20));
		}
		System.out.println(list);

		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);

	}
}
