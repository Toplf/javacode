package stu05;

/**
 方法(method) 是某种功能的体现, 也称为函数(function)
 方法必须定义在类中, 方法不可以嵌套定义.

 方法组成部分:
 修饰符 返回值类型 方法名(数据类型1 形式参数1, 数据类型2 形式参数2, 数据类型3 形式参数3,....) {
 语句块
 return 返回值;
 }

 返回值类型 : 方法的成果的类型
 方法名 : 标识某功能
 形式参数 : 用于传递数据, 使用者传递给本方法. 方法功能需要一些数据, 但是同时数据的值对功能没有影响..
 实际参数 : 使用者在使用本方法时传递的实际的数据.

 方法 = 方法头(方法签名, 相当于方法的功能使用说明书API) + 方法体;

 方法的设计者
 方法的调用者

 方法的调用语句 : 方法名(实际参数1, 实际参数2, ....); // 实参列表必须符合形参列表
 方法的返回值接收 : 方法调用本身, 只有一次机会获取, 一旦错过 永远错过.

 如果方法没有返回值, 使用void来表示
 如果方法没有参数, 参数列表为空, 但是不能省略()

 参数是方法的功能的输入数据, 可以有多个
 返回值是方法的功能的输出数据, 最多有一个.

 方法的实参的类型只需要被形参类型兼容即可.
 方法中实际的返回值的类型只需要被方法的返回值类型兼容即可.
 */
public class MethodTest {

	// 自定义方法, 方法之间必须是并列
	// 修饰符 返回值类型 方法名(数据类型1 形式参数1, 数据类型2 形式参数2, 数据类型3 形式参数3,....) {
	public static int add(int a, int b) {
		System.out.println("add(int a, int b)...");
		int c = a + b;
		return c;
	}

	public static void hello() {
		System.out.println("hello...");
		//return; 最后一行的return可以省略.
	}

	public static void main(String[] args) {
		System.out.println("main begin..");

		int x = add(10, 20);
		System.out.println(x);
		//System.out.println(c);

		System.out.println(add(50, 80));

		//int n = hello(); // ()是方法的标志, 如果方法没有返回值, 绝不可以接收它的返回值!!!
		//System.out.println(hello()); 如果方法没有返回值, 也不可以打印它的调用.
		hello();

		System.out.println("main end..");
	}
}