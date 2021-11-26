//一个源文件中可以包含多个类的定义
// 主类
// 公共类的类名必须和文件名一致, 一个源文件中肯定只能有一个公共类.
public class Test1 {

	public static void main(String[] args) {
		System.out.println("Test1 main...");
	}

}

class Test2 {

	public static void test2() {
		System.out.println("Test2 test2...");
	}
}

class Test3 {

	public static void main(String[] args) {
		System.out.println("Test3 main...");
	}
}

class public2 {

}