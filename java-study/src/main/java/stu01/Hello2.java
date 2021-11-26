package stu01;

// 注释 : 是一种说明性文字, 它不参与程序的执行, 但是可以起到说明的作用
// 这是单行注释, 只能注释当前的一行
/*
	这是多行注释, 可以一次性注释多行的文本
	第二行也可以被注释
	多行注释不可以嵌套
*/

/*
	public 是公共的意思, 它本身是一个修饰符. 后面修饰的是类
	class 是类的意思, 作用是用于定义一个类
	Hello2 是类名
	{}表示一个范围, 类名后面的一对{}及其中的内容称为类体(body)
	类 = 类头(类签名) + 类体
	类是java程序的基本单位. 要想构成一个程序必须要有一个类.

	这个类包含了主方法, 所以类也称为"主类"
*/
public class Hello2 {

	/*
		下面是一个方法的定义, 方法是java程序的一个独立的功能单位.
		public 表示方法是公共方法.
		static 也是修饰符 表示这个方法是静态方法.
		void 是空的意思, 表示方法没有返回值
		main 是方法名
		(String[] args) 是方法的参数列表
		参数后面的一对{}及其中的内容称为方法体
		方法 = 方法头(方法签名) + 方法体

		这是主方法, 入口方法, 程序总是从主方法开始执行!!!
		主方法的写法是固定的, 必须记住它!!
	*/


	public static void main(String[] args) {
		// 下面的是一个语句, 语句是java程序的最小执行单位
		// 这是一个打印语句, 作用是在控制台上打印输出一段内容, 内容由括号中的内容来决定,
		// 语句必须以;为结束!!!!
		System.out.println("双引号中可以随便写, 都无所谓, 因为我是字符串");
		System.out.println("这是第二个语句");
		System.out.println("这是第3个语句");
		System.out.println("这是第4个语句");
		System.out.println("这是第5个语句");
		System.out.println("这是第6个语句");
	}

	// 类中可以有多个方法, 但是方法不能冲突!!!
	/*
	public static void main(String[] args) {
		System.out.println("main2 ");
	}*/

	// 这个方法不会执行, 因为它不是入口方法(主方法)
	public static void test() {
		System.out.println("test...");
	}

}