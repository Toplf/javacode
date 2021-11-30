package stu08;

import java.lang.System; // java.lang这个包是默认导入的, 其他包的使用必须导入 或 全限定

//import com.atguigu.javase.javabean.*; 这种写法尽量避免, 降低可读性了.

/*
import 导入, 导入其他包中的类
告诉编译器, 使用该类时, 到哪个包下面去定位类
*/

public class TeacherTest {

	public static void main(java.lang.String[] args) {
		//com.atguigu.javase.javabean.Computer com = new com.atguigu.javase.javabean.Computer(3.8, 8); // 跨包使用类时, 必须全限定
		Computer com = new Computer(3.8, 8);
		//com.atguigu.javase.javabean.Teacher t = new com.atguigu.javase.javabean.Teacher("佟刚", 40, "男", com);
		Teacher t = new Teacher("佟刚", 40, "男", com);
		t.lesson();
		t.jingdong();

		System.out.println(t.say());
	}
}