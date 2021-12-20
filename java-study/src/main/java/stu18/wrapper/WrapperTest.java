package stu18.wrapper;

import org.junit.Test;

/**
 *  单元测试方法的要求 : 类必须是公共的, 必须不能有任何构造器
 *  方法必须是公共非静态无返回值无参.
 *  执行 : 在方法名上右击, 点击run as - junit
 *
 *  包装类 : 把基本数据包装成对象
 *  byte		Byte
 *  short		Short
 *  int 		Integer
 *  long		Long
 *  float		Float
 *  double		Double
 *  boolean		Boolean
 *  char		Character
 *
 *  装箱  :
 *  	Xxx obj = new Xxx(xxx); 手工装箱
 *  	Xxx obj = new Xxx("xxx"); 字符串转为对象
 *
 *  拆箱 :
 *  	obj.xxxValue(); // 手工拆箱
 *
 *  把字符串转换成基本值 :
 *  	String str = "xxx";
 *  	xxx = Xxx.parseXxx(str);
 *
 *  把基本值转换成字符串 :
 *  	String str = "" + xxx;
 *  	String str = String.valueOf(xxx);
 */
public class WrapperTest {

	@Test
	public void test3() {
		Double obj1 = new Double(3.22);
		Double obj2 = 0.22;

		double v1 = obj1.doubleValue();
		double v2 = obj2;

		String string = "32.99";
		double v3 = Double.parseDouble(string);

		Double obj3 = Double.valueOf(string);
		Double obj4 = new Double(string);

		String string2 = "false";
		boolean b1 = Boolean.parseBoolean(string2);
		Boolean obj5 = true;
		boolean b2 = obj5.booleanValue();
	}

	@Test
	public void exer() {
		// 声明两个字符串, 内容是整数
		String s1 = "2348";
		String s2 = "832";
		// 把第一个字符串转换成整数, 再手工装箱
		Integer obj1 = new Integer(Integer.parseInt(s1));
		// 把第二个字符串直接变成包装类对象
		//Integer obj2 = new Integer(s2);
		//Integer obj2 = Integer.decode(s2);
		Integer obj2 = Integer.valueOf(s2);

		// 手工拆箱求和, 自动拆箱求商.
		System.out.println(obj1.intValue() + obj2.intValue());
		System.out.println(obj1 / obj2);
	}

	@Test
	public void test2() {
		int n = 100;
		// 把基本型包装成对象
		Integer obj1 = new Integer(n); // 手工装箱
		Integer obj2 = 200; // 自动装箱, 编译器行为 : Integer obj2 = new Integer(200);

		System.out.println(obj1);
		System.out.println(obj2);

		// 把包装类对象中的基本值取出来, 拆箱
		int v1 = obj1.intValue(); // 手工拆箱
		int v2 = obj2; // 自动拆箱, 编译器行为 : int v2 = obj2.intValue();

		int v3 = obj1 * obj2;
		System.out.println(v3);

		// 把字符串变成整数
		int v4 = Integer.parseInt("239"); // 工具方法, 静态方法
		System.out.println(v4);


	}

	// 使用单元测试
	@Test
	public void test1() {
		System.out.println("test1...");
	}
}