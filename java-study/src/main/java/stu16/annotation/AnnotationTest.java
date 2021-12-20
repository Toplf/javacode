package stu16.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 	注解 : 是一种特殊的注释, 不参与程序的执行. 特殊之处在于编译器和JVM都能识别到.
 * 	@Override 作用是告诉编译器, 它修饰的方法要完成方法覆盖, 请帮助作条件检查. 只能修改方法
 *	@Deprecated 作用是警告使用者, 它修饰的目标过期了. 可以修饰类, 属性, 方法, 构造器, 形参, 局部变量
 *	@SuppressWarnings 作用是抑制编译器警告, 并且可以传递参数, (参数可以是一个值, 也可以是一个数组)
 *
 *	注解 :
 *		1) 没有属性的, 称为标记型注解
 *		2) 有属性的, 可以进一步传递数据.
 */

// 自定义注解 , 默认可以修饰的目标是类, 属性, 构造器, 方法, 形参, 局部变量
// @Target元注解的作用是约束注解可以修饰的目标, 可以指定TYPE(类), FIELD(属性), METHOD(方法), CONSTRUCTOR(构造器),
//PARAMETER(形参), LOCAL_VARIABLE(局部变量)
@Target({ElementType.TYPE, ElementType.METHOD}) // 可以修饰类和方法
// @Retention元注解的作用是约束注解的停留期, 常量有 :
// RetentionPolicy.SOURCE表示停留期只在源码中.
// RetentionPolicy.CLASS表示的是注解可以停留在class文件中, 但是运行时无法获取, 这是缺省的
// RetentionPolicy.RUNTIME 表示停留期是在运行时, 这样就可以通过反射处理.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
	int id() default 10; // 属性的写法和方法类似
	String name() default "我是缺省值"; // 可以有缺省值
}

//@Override
@Deprecated
@MyAnnotation(id = 1, name = "abc")
class Person {

	//@Override
	@Deprecated
	private String name;
	//@MyAnnotation(name = "yyy", id = 2)
	private int age;
	private String gender;

	@SuppressWarnings({ "unused", "null" })
	@Deprecated
	public Person() {
		@Deprecated int n;
		int[] arr = null;
		System.out.println(arr.length);
	}

	//@Override
	//@MyAnnotation(id = 4)
	public Person(/*@Override*/ String name, @Deprecated int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Deprecated
	public String getName() {
		return name;
	}

	public void setName(/*@MyAnnotation*/ String name) {
		this.name = name;
		/*@MyAnnotation*/ int x = 100;
	}

	@MyAnnotation
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@MyAnnotation
	public String getGender() {
		return gender;
	}

	//@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}


public class AnnotationTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.getName();
	}
}