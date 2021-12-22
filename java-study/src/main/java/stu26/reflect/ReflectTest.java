package stu26.reflect;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;
import stu26.javabean.Student;


public class ReflectTest {

	@Test
	public void testName() throws Exception {
		Class<Student> clazz3 = (Class<Student>) Class.forName("com.atguigu.javase.javabean.Student");
		Student student = clazz3.newInstance();
		// 访问属性
		//Field field1 = clazz3.getField("id");
		Field field1 = clazz3.getDeclaredField("id");
		field1.setAccessible(true);
		field1.set(student, 1);

		System.out.println(student);

		// 调用方法 setName(String name)
		Method method1 = clazz3.getMethod("setName", String.class);
		method1.invoke(student, "小明"); // student.setName("小明");

		System.out.println(student);

		// 调用方法 int getId()
		Method method2 = clazz3.getMethod("getId");
		Object invoke = method2.invoke(student);
		System.out.println(invoke);

		// 父类
		System.out.println("父类 : " + clazz3.getSuperclass());
		System.out.println("父类的父类 : " + clazz3.getSuperclass().getSuperclass());

		// 接口
		Class<?>[] interfaces = clazz3.getInterfaces();
		for (Class<?> class1 : interfaces) {
			System.out.println(class1);
		}
	}

	@SuppressWarnings("unchecked")
	public static void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 获取Student类模板对象方式 :
		// 1) 通过类的静态属性, 最快最安全
		Class<Student> clazz1 = Student.class;
		// 2) 通过对象, 调用getClass()方法
		Class<Student> clazz2 = (Class<Student>)new Student().getClass();

		System.out.println(clazz1 == clazz2);

		// 3) 通过类的全限定名称, 调用Class静态方法forName
		Class<Student> clazz3 = (Class<Student>) Class.forName("com.atguigu.javase.javabean.Student");
		Student student = clazz3.newInstance();

		// 4) 通过类加载器, 调用loadClass()
		ClassLoader classLoader = ReflectTest.class.getClassLoader();
		Class<?> clazz4 = classLoader.loadClass("com.atguigu.javase.javabean.Student");

		System.out.println(clazz3 == clazz4);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		test1();
	}
}
