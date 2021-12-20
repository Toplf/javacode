package stu21.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * 	Collection 集合 : 保存一个一个的对象, 特点 : 无序可重复
 *
 * 		Set 特点 : 无序不可重复
 * 			HashSet : 基于数组使用哈希算法实现的Set集合, 判定重复的标准是两个对象的equals为true, 并且两个对象的hashCode一样
 * 				优点 : 全是优点
 * 				缺点 : 对内存要求高
 *
 * 			TreeSet : 基于二叉搜索树(红黑树)实现的Set集合, 判定重复的标准是两个对象的比较结果为0
 * 				优点 : 对内存要求低, 搜索速度快
 * 				缺点 : 插入和删除的速度慢
 *
 * 		List : 特点 : 有序可重复
 * 			ArrayList : 基于数组实现的List集合, 线程不安全.
 * 				缺点 : 对内存要求高, 因为内存必须连续, 非末端数据的插入和删除都是最慢的, 因为有大量元素的移动.
 * 				优点 : 末端插入删除速度快
 * 				适用场景 : 存档数据, 主要用于查询检索
 *
 * 			Vector : 和ArrayList一样, 是一个古老的实现. 但是线程安全
 *
 * 			LinkedList : 基于链表实现的List集合
 * 				优点 : 对内存要求低. 插入,删除速度非常快
 * 				缺点 : 检索速度慢,
 * 				适用场景 : 频繁修改数据, 很少检索
 *
 *	泛型 : 类型安全问题, 在集合中使用泛型的好处是约束中的元素的数据类型, 类型可以是确定的, 不再是类型最模糊的Object
 *
 *	遍历 : 增强for
 *			for (元素数据类型 临时变量 : 集合) {
 *			}
 *
 *		  迭代器 Iterator
 *
 必须从集合对象获取迭代器
 while (迭代器.hasNext()) {
 元素 = 迭代器.next();
 处理元素;
 }

 Map集合 : 保存的是一对一对的对象. 是具有映射关系的键值对象, 键值对象都可以是任意对象. 键到值是单向一对一映射.
 Map可以简单地看作是一个词典, 键是词条, 值是解释.
 Object put(Object key, Object value); //写入条目
 Object remove(Object key); // 根据键删除 一个条目
 Object get(Object key); // 根据键查找值, 查词典
 Set keySet(); // 获取一个保存所有键对象的Set子集合
 Set entrySet(); // 获取保存所有条件对象的Set集合
 int size() ; 条目个数


 HashMap 是典型实现, 使用哈希算法实现的Map集合
 TreeMap 是基于二叉树实现的Map集合
 Hashtable 是古老的实现, 和HashMap一样, 它是线程安全, 效率低.
 */



public class CollectionTest {

	@Test
	public void test6() {
		List<String> list = new LinkedList<String>(); // 基于数组的List
		list.add("yy");
		list.add("cc");
		list.add("dd");
		list.add("aa");
		list.add("ee");
		list.add("f1");
		list.add("f2");
		list.add("f3");
		list.add("f4");
		list.add("f5");

		list.add("f6");
		list.remove(2);

		list.add(0, "XX");

		Iterator<String> iterator = list.iterator(); // 内部有一个期望值
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}

	@Test
	public void test5() {
		List<String> list = new ArrayList<String>(); // 基于数组的List
		list.add("yy");
		list.add("cc");
		list.add("dd");
		list.add("aa");
		list.add("ee");
		list.add("f1");
		list.add("f2");
		list.add("f3");
		list.add("f4");
		list.add("f5");

		list.add("f6");
		list.remove(2);

		list.add(0, "XX");

		Iterator<String> iterator = list.iterator(); // 内部有一个期望值
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}

	@Test
	public void test4() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 20));
		}
		System.out.println(list);
		Collections.sort(list); // 排序
		System.out.println(list);
		Collections.reverse(list); // 反转
		System.out.println(list);
		Collections.shuffle(list); // 洗牌
		System.out.println(list);

		Integer max = Collections.max(list);
		System.out.println(max);
		HashSet<Integer> hashSet = new HashSet<Integer>(list);
		Integer min = Collections.min(hashSet);
		System.out.println(min);

		Set<Teacher> set = new HashSet<Teacher>();
		set.add(new Teacher("佟刚", 40, "男"));
		set.add(new Teacher("萌萌", 30, "女"));
		set.add(new Teacher("程程", 20, "女"));
		set.add(new Teacher("明哥", 50, "男"));
		set.add(new Teacher("阳哥", 35, "男"));

		Comparator<Teacher> comparator = new Comparator<Teacher>() {
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return o1.getAge() - o2.getAge();
			}
		};

		Teacher max2 = Collections.max(set, comparator);
		System.out.println(max2);
	}

	@Test
	public void test3() throws FileNotFoundException, IOException {
		//Properties 是Hashtable的子类, 专门用于处理配置文件(文本文件, 内容是键=值)
		Properties properties = new Properties();
		properties.load(new FileInputStream("test.properties"));
		System.out.println(properties);

		String property = properties.getProperty("password");
		System.out.println(property);
	}

	/*编写程序，在main方法中创建Map集合（使用泛型），用来存放圆的半径（key）和面积（value）；
	以半径为key，面积为value，将半径1-50的圆面积数据(直接取整)保存其中；
	将Map中的半径数据取至Set集合中；
	遍历Set集合的半径，逐一从Map中取出对应的面积值，并将半径和面积打印出来。*/
	@Test
	public void exer2() {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 1; i < 51; i++) {
			int area = (int)(Math.PI * i * i);
			map.put(i, area);
		}
		// 遍历
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer radius = iterator.next();
			Integer area = map.get(radius);
			System.out.println(radius + " *********************** " + area);
		}
	}

	@Test
	public void test2() {
		/*
		Object put(Object key, Object value); //写入条目
 		Object remove(Object key); // 根据键删除 一个条目
 		Object get(Object key); // 根据键查找值, 查词典
 		Set keySet(); // 获取一个保存所有键对象的Set子集合
 		Set entrySet(); // 获取保存所有条件对象的Set集合
 		int size() ; 条目个数
 		*/
		Map<Integer,String> map = new HashMap<Integer, String>(); // 空词典
		map.put(5, "five");
		map.put(2, "two");
		map.put(0, "zero");
		map.put(1, "one");
		map.put(9, "nine");
		map.put(7, "seven");
		map.put(0, "ZERO"); // 当键重复时, 会刷新值对象
		map.put(5, "FIVE");
		System.out.println(map.size());
		map.remove(9);
		String string = map.get(7);
		System.out.println(string);
		//System.out.println(map);



		// 遍历一
		System.out.println("**************************S");
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next(); // 获取键对象
			String value = map.get(key); // 根据键对象获取到对应的值对象
			System.out.println(key + ">>>>>>>>>>>>>>>>>>>>>>>>>" + value);
		}
		// 遍历二
		System.out.println("****************************");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " <<<<<<<<<<<<<<<<<<<< " + entry.getValue());
		}
	}

	@Test
	public void test1() {
		List<Integer> list = new ArrayList<Integer>(); // 有序可重复
		for (int i = 0; i < 11; i++) {
			list.add((int)(Math.random() * 20));
		}

		// 语法糖, 为了统一数组和集合的遍历
		for (Integer integer : list) {
			System.out.println(integer);
		}

		// 迭代器遍历
		Iterator<Integer> iterator = list.iterator(); // 必须从集合对象获取
		// 注意点 1 : 迭代器一旦获取到, 就应该马上使用, 如果中间出现了对象集合的修改, 都会导致迭代器被污染
		//			 迭代器必须使用新鲜的, 冒热气的.
		//list.add(100);
		int sum = 0;
		while (iterator.hasNext()) { // hasNext用于检测当前游标后面是否有元素
			Integer next = iterator.next(); // 获取当前游标后面的元素, 并且还要移动游标
			// 注意点 2 : 在循环中只能调用一次next()方法.
			System.out.println(next);
			sum += next;
		}
		System.out.println("sum : " + sum);
		// 注意点 3 : 迭代器是一次性使用, 使用完就作废.
	}

	//写一个类Teacher, 包括属性name, age, gender, 创建一些对象,
	//使用定制排序把这些对象保存在Set集合中, 要求按照年龄倒序排序.
	@Test
	public void work2() {
		Comparator<Teacher> comparator = new Comparator<Teacher>() {
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return -(o1.getAge() - o2.getAge());
			}
		};

		Set<Teacher> set = new TreeSet<Teacher>(comparator);
		set.add(new Teacher("佟刚", 40, "男"));
		set.add(new Teacher("萌萌", 30, "女"));
		set.add(new Teacher("程程", 20, "女"));
		set.add(new Teacher("明哥", 50, "男"));
		set.add(new Teacher("阳哥", 35, "男"));

		for (Teacher teacher : set) {
			System.out.println(teacher);
		}
	}

	/**
	 * 创建一个List集合, 保存10个随机的整数 对其进行排序.
	 把所有元素保存在另外一个HashSet集合中, 找出最大值.
	 */
	@Test
	public void work1() {
		List<Integer> list = new ArrayList<Integer>(); // 有序可重复
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 20));
		}
		System.out.println(list);
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				// 比较j和j+1
				if (list.get(j) > list.get(j + 1)) { // 自动拆箱
					Integer tmp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, tmp);
				}
			}
		}
		System.out.println(list);

		Set<Integer> set = new HashSet<Integer>(list); //可以一次性把参数中集合中的内容添加到当前集合
		//set.addAll(list); // 可以一次性把参数中集合中的内容添加到当前集合
		/*
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		*/
		System.out.println(set);

		int max = 0x80000000;
		for (Integer integer : set) {
			if (integer > max) {
				max = integer;
			}
		}
		System.out.println("max : " + max);
	}
}
