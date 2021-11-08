package com.luof.oop.inheritance.array;

import com.luof.oop.inheritance.array.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stuArr = new Student[20];
        String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
        String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int index1 = (int)(Math.random() * names1.length);
            int index2 = (int)(Math.random() * names2.length);
            String name = names1[index1] + names2[index2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
        // 选择排序
        // 以位置为主导,
        for (int i = 0; i < stuArr.length - 1; i++) {
            // 以i下标位置为基准位置, 找最小值下标
            int minIndex = i;
            for (int j = i + 1; j < stuArr.length; j++) {
                if (stuArr[j].getScore() < stuArr[minIndex].getScore()) {
                    minIndex = j;
                }
            }
            // minIndex中就保存了最小值下标
            Student tmp = stuArr[i];
            stuArr[i] = stuArr[minIndex];
            stuArr[minIndex] = tmp;
        }
        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
    }


    public static void main1(String[] args) {
        Student[] stuArr = new Student[20];
        String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
        String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int index1 = (int)(Math.random() * names1.length);
            int index2 = (int)(Math.random() * names2.length);
            String name = names1[index1] + names2[index2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
        //冒泡
		/*
		for (int j = 0; j < arr.length - 1; j++) { // 控制趟数
			for (int i = 0; i < arr.length - 1 - j; i++) { // 控制每一趟的比较交换次数, 应该随着外循环的增加而减少
				if (arr[i] > arr[i + 1]) { // 比较相邻元素, 如果左大右小, 就交换
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}*/
        // 把学生对象按照分数排序
        for (int i = 0; i < stuArr.length - 1; i++) {
            for (int j = 0; j < stuArr.length - 1 - i; j++) {
                // 比较相邻元素, j和j+1
                if (stuArr[j].getScore() > stuArr[j + 1].getScore()) {
                    Student tmp = stuArr[j];
                    stuArr[j] = stuArr[j + 1];
                    stuArr[j + 1] = tmp;
                }
            }
        }
        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
    }
}
