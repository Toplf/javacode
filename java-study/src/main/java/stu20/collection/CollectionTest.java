package stu20.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * 	集合 : 解决是批量对象的存储问题. 可以简单地看作是一个可变长度的Object[].
 *
 * 	Collection集合 : 保存一个一个的对象, 特点是 无序可重复
 * 					无序 : 不按添加顺序保存元素, 重复的元素也可以添加.
 * 					重复 : 指的是对象的内容, 不是地址
 *
 * 		boolean add(Object obj) 向集合中添加一个对象, 如果是Set, 表现为在添加重复时返回false
 * 		boolean contains(Object obj) 判断集合中是否包含参数中的对象
 * 		boolean remove(Object obj) 从集合中删除指定的对象
 * 		int size() 获取集合中的元素个数
 *
 * 		Set 子接口 特点 : 无序不可重复
 * 			HashSet : 使用哈希算法实现的Set集合 , 使用频率最高
 * 				去重规则 : 两个对象的equals为true,并且两个对象的哈希码相等.
 *
 * 			TreeSet : 使用树实现的Set集合, 是二叉树可以达到自然排序的效果.
 * 				去重规则 : 两个对象的compareTo返回0
 *
 * 		List 子接口 特点 : 有序可重复
 * 			void add(int index, Object ele) 在指定下标处插入新元素
 * 			Object get(int index) 获取指定下标处的元素
 * 			Object remove(int index) 删除指定下标处的元素
 * 			Object set(int index, Object ele) 替换指定下标元素为新元素
 *
 * 			ArrayList : 使用数组实现的List集合
 * 			LinkedList : 使用链表实现的List集合
 *
 *  Map集合 : 保存一对一对的对象
 *
 *     泛型 : 解决的是类型安全问题, 因为默认的Object类型太模糊了.
 *     一旦在集合中使用了泛型 , 集合中的数据安全了, 不同类型的数据无法添加, 取出来的数据永远是泛型类型.
 */
class Student implements Comparable {

	private int id;
	private String name;
	private int grade;
	private double score;

	public Student() {
	}

	public Student(int id, String name, int grade, double score) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (grade != other.grade)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			return this.grade - ((Student)o).grade;
		}
		throw new RuntimeException("对象不可比");
	}

}

// 自定义比较器
class MyComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student && o2 instanceof Student) {
			//return ((Student)o1).getGrade() - ((Student)o2).getGrade();
			return (int)(((Student)o1).getScore() * 10 - ((Student)o2).getScore() * 10);
		}
		throw new RuntimeException("对象不可比");
	}
}

public class CollectionTest {

	@Test
	public void test8() {
		// 泛型技术, 约束集合中能够保存的元素的类型
		// 只需要在类名后面<元素数据类型>
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		//list.add("xxxx"); 不同的类型无法添加!!!
		list.add(8);
		list.add(9);
		//list.add("abc");
		list.add(10);

		// 求和
		int sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}

		/*
		for (Object object : list) {
			if (object instanceof Integer) {
				sum += (Integer)object;
			}
		}*/
		System.out.println("sum : " + sum);
	}

	@Test
	public void test7() {
		Comparator myComparator = new MyComparator();
		// 定制排序, 优先于自然排序
		Set set = new TreeSet(myComparator); // 对象关联

		Student s1 = new Student(1, "小明", 3, 90);
		Student s2 = new Student(2, "小刚", 5, 70);
		Student s3 = new Student(3, "小丽", 1, 100);

		set.add(s1);
		set.add(s2);
		set.add(s3);

		for (Object object : set) {
			System.out.println(object);
		}
	}

	@Test
	public void test6() {
		Set<Student> set = new TreeSet<Student>(); // 自然排序

		Student s1 = new Student(1, "小明", 3, 90);
		Student s2 = new Student(2, "小刚", 3, 70); // 小刚和小明的年级一样, 会产生去重效果
		Student s3 = new Student(3, "小丽", 1, 100);

		set.add(s1);
		set.add(s2);
		set.add(s3);

		for (Student object : set) {
			System.out.println(object);
		}
	}

	@Test
	public void test5() {
		Set set = new TreeSet(); // 无序不可重复
		set.add(10);
		set.add(8);
		set.add(2);
		set.add(9);
		/*
		set.add(2.3);
		set.add('9');
		*/

		/*
		set.add("aaa"); // 不可以添加类型不同的元素, 因为要比大小.
		set.add("ccc");
		set.add("yyy");
		set.add("QQQ");
		*/
		System.out.println(set);
	}

	@Test
	public void test4() {
		Set set = new TreeSet(); // 无序不可重复
		set.add(10);
		set.add(8);
		set.add(2);
		set.add(9);
		set.add(1);
		set.add(7);
		set.add(4);

		for (Object object : set) {
			System.out.println(object);
		}
	}

	@Test
	public void test3() {
		Set set = new HashSet(); // 无序不可重复
		// 对象去重时依据的是两个对象的equals是否为true, 并且两个对象的哈希码也相同.
		Student s1 = new Student(1, "小明", 3, 90);
		Student s2 = new Student(1, "小明", 3, 90);
		Student s3 = new Student(2, "小丽", 1, 100);

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s3);

		for (Object object : set) {
			System.out.println(object);
		}
	}

	// 创建一个List集合, 保存10个20以内的随机整数
	@Test
	public void exer2() {
		List list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 20);
			list.add(rand);
		}

		// 遍历
		for (Object object : list) {
			System.out.println(object);
		}
	}
	// 创建一个List集合, 保存10个20以内的随机整数,  不要重复的.
	@Test
	public void exer22() {
		List list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 20);
			if (list.contains(rand)) {
				i--;
				continue;
			}
			list.add(rand);
		}

		// 遍历
		for (Object object : list) {
			System.out.println(object);
		}
	}

	@Test
	public void exer23() {
		List list = new ArrayList();
		for (int i = 0; i < 10;) {
			int rand = (int)(Math.random() * 20);
			if (!list.contains(rand)) {
				list.add(rand);
				i++;
			}
		}

		// 遍历
		for (Object object : list) {
			System.out.println(object);
		}
	}

	@Test
	public void test2() {
		List list = new ArrayList(); // 有序可重复
		list.add("yyy");
		list.add("abc");
		list.add(new Integer(5));
		list.add(2); // 自动装箱
		list.add(5);
		list.add("abc");
		list.add(new Student(1, "小明", 3, 20));
		list.add(false);

		System.out.println(list); // [yyy, abc, 5, 2, 5, abc, Student [id=1, name=小明, grade=3, score=20.0], false]
		System.out.println(list.size());

		list.add(5, "插入"); // 在指定位置插入值
		System.out.println(list);

		Object object = list.get(3); // 获取指定下标元素
		System.out.println(object);

		boolean b = list.contains("abc");
		System.out.println(b);

		list.remove(2); // 优先作为下标整数来用的
		System.out.println(list);

		System.out.println("*************************************");
		// 遍历
		for (int i = 0; i < list.size(); i++) {
			Object object2 = list.get(i);
			System.out.println(object2);
		}
	}

	// 创建一个Set集合, 保存10个20以内的随机整数
	@Test
	public void exer1() {
		Set set = new HashSet();
		for (int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 20);
			set.add(rand); // set.add(Integer.valueOf(rand));
		}
		System.out.println(set);
	}

	@Test
	public void exer13() {
		Set set = new HashSet();
		for (int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 20);
			boolean flag = set.add(rand);
			if (!flag) {
				i--;
			}
		}
		System.out.println(set);
	}

	@Test
	public void exer14() {
		Set set = new HashSet();
		for (int i = 0; i < 10;) {
			int rand = (int)(Math.random() * 20);
			boolean flag = set.add(rand);
			if (flag) {
				i++;
			}
		}
		System.out.println(set);
	}

	// 创建一个Set集合, 保存10个20以内的随机整数, 必须10个.
	@Test
	public void exer12() {
		Set set = new HashSet();
		while (set.size() != 10) {
			int rand = (int)(Math.random() * 20);
			set.add(rand); // set.add(Integer.valueOf(rand));
		}
		System.out.println(set);
	}
	@Test
	public void test1() {
		Set set = new HashSet(); // 无序不可重复
		set.add("yyy"); // 添加对象
		set.add("abc");
		set.add(new Integer(200));
		set.add(new Student(1, "小明", 2, 90));
		set.add(100); // set.add(Integer.valueOf(100));
		boolean b1 = set.add(200); // 此对象无法添加, 因为重复了
		System.out.println(b1);
		boolean b2 = set.add("abc");// 此对象无法添加, 因为重复了
		System.out.println(b2);
		System.out.println(set.size()); // 元素个数 : 5
		System.out.println(set.contains("xxx")); // 是否包含
		System.out.println(set);
		set.remove(100); // 删除
		System.out.println(set);

		// 遍历集合
		// 增强for循环
		//for (元素类型 临时变量 : 集合) {
		//	处理临时变量
		//}
		for (Object object : set) {
			System.out.println(object);
		}
	}
}
