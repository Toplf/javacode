package stu26.javabean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentData {

	public static List<Student> getList() {
		// 创建集合
		List<Student> list = new ArrayList<Student>();
		String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
		String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
		for (int i = 0; i < 20; i++) {
			int id = i + 1;
			int index1 = (int)(Math.random() * names1.length);
			int index2 = (int)(Math.random() * names2.length);
			String name = names1[index1] + names2[index2];
			int grade = (int)(Math.random() * 6 + 1);
			double score = (int)(Math.random() * 101);
			list.add(new Student(id, name, grade, score));
		}

		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));
		list.add(new Student(30, "小明", 3, 20));

		// 遍历 list集合
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("**************************************************************");
		return list;
	}

	public static void main(String[] args) {
		List<Student> list = getList();
		// 3年级没有及格的同学倒序, 取出前2个.
		List<Student> list2 = new ArrayList<Student>();
		for (Student student : list) {
			if (student.getGrade() == 3) {
				list2.add(student);
			}
		}
		List<Student> list3 = new ArrayList<Student>();
		for (Student student : list2) {
			if (student.getScore() < 60) {
				list3.add(student);
			}
		}
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return -(int)(o1.getScore() - o2.getScore());
			}
		};
		Collections.sort(list3, comparator);
		for (Student student : list3) {
			System.out.println(student);
		}

		List<Student> list4 = new ArrayList<Student>();
		for (Student student : list3) {
			list4.add(student);
			if (list4.size() == 2) {
				break;
			}
		}
		System.out.println("****************************************************");
		for (Student student : list4) {
			System.out.println(student);
		}
	}
}
