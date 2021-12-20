package stu16.interfacetest;

public class ComparableTest {

	public static void main(String[] args) {
		Student s1 = new Student(1, "小明", 3, 80);
		Student s2 = new Student(2, "小丽", 2, 90);

		//System.out.println(s1.compareTo(s2));
		Student[] stuArr = new Student[5];
		stuArr[0] = s1;
		stuArr[1] = s2;
		stuArr[2] = new Student(3, "小花", 1, 95);
		stuArr[3] = new Student(4, "小刚", 4, 25);
		stuArr[4] = new Student(5, "小伟", 6, 75);

		// 遍历
		for (Student tmp : stuArr) {
			System.out.println(tmp);
		}
		System.out.println("******************************************");
		// 排序

		Sorter.sort(stuArr);

		// 遍历
		for (Student tmp : stuArr) {
			System.out.println(tmp);
		}

		String[] arr = {"zz", "qq", "AAA", "123", "汉字", "english"};

		Sorter.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}