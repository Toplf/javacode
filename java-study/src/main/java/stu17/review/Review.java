package stu17.review;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 内部类
	成员内部类 :
		普通内部类
		嵌套类
	局部内部类 :
		普通局部内部类
		匿名内部类(超重点)
*/

interface I1 {
	void hello();
}

class C1 implements I1 {
	@Override
	public void hello() {
		System.out.println("C1 implement");
	}

}

// 枚举 : 对象是可数的固定的特殊类型
enum Season {
	SPRING, SUMMER, AUTUME, WINTER
}

// 注解 : 是一种特殊的注释. 注解的处理只能通过反射的方式, 要想反射, 必须使用元注解@Retention
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME) // 只有注解的停留期定义在运行时才可以被反射
@interface Ann {
	// 数据类型 属性名() default 缺省值;
	String value() default "aaa"; // 如果属性名是value在传值时可以省略参数名
}

@Ann(value = "xxx")
public class Review {

	//@Ann
	private static int a;

	@Ann("yyy")
	public static void main(String[] args) {
		Season season = Season.AUTUME;
		System.out.println(season);
	}

	@Ann
	public static void main1(String[] args) {
		// 匿名内部类
		I1 i1 = new I1() {
			@Override
			public void hello() {
				System.out.println("匿名内部类实现");
			}
		};

		i1.hello(); // 虚拟方法调用

		new I1() {
			@Override
			public void hello() {
				System.out.println("匿名内部类2");
			}
		}.hello(); // 一次性调用
	}
}