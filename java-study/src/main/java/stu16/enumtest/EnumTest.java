package stu16.enumtest;

/**
 * 对象是可数的特殊类
 */
enum TrafficSingnal {

	GO(60), STOP(30), CAUTION; // 默认调用了无参构造器, 要想调用有参构造, 必须后面直接带实参.

	public int seconds; // 枚举也可以有属性

	private TrafficSingnal() {
	}

	// 构造器必须私有
	private TrafficSingnal(int seconds) {
		this.seconds = seconds;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return super.toString() + ", 时间 : " + seconds;
	}
}


public class EnumTest {

	public static void main(String[] args) {
		//new TrafficSingnal();
		TrafficSingnal ts = TrafficSingnal.CAUTION; // 获取枚举对象, 直接从类中取
		System.out.println(ts);

		ts = TrafficSingnal.valueOf("STOP"); // 根据常量对象名获取对象
		System.out.println(ts);

		System.out.println("********************************");

		TrafficSingnal[] values = TrafficSingnal.values(); // 所有的常量对象都获取到
		int n = Integer.parseInt(args[0]);
		ts = values[n];
		System.out.println(ts);
		ts.seconds = 50;

		switch (ts) { // 分支, 括号中变量类型: 非long整数, 字符串, 枚举
			case GO: // case后面必须跟常量, 字面量和final修饰的量
				System.out.println("绿灯");
				break;
			case CAUTION :
				System.out.println("黄灯");
				break;
			case STOP :
				System.out.println("红灯");
				break;
		}

	}
}