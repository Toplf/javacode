package stu25.javabean;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
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
			//new Student(id, name, grade, score);
		}
		// 遍历 list集合
		// 3年级没有及格的同学倒序, 取出前2个.
	}
}
