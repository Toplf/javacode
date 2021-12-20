package stu16.enumtest;

/*声明Week枚举类，其中包含星期一至星期日的定义；
在main方法中从命令行接收一个1-7的整数(使用Integer.parseInt方法转换)，
分别代表星期一至星期日，打印该值对应的枚举值，
添加一个属性, String feel.
*/
enum Week {
	MON("不高兴"), TUE("不高兴"), WED("不高兴"), THU("不高兴"), FRI("不高兴"), SAT("高兴"), SUN("很高兴");

	private String feel;

	private Week(String feel) {
		this.feel = feel;
	}

	public String getFeel() {
		return feel;
	}

	public void setFeel(String feel) {
		this.feel = feel;
	}

	@Override
	public String toString() {
		return super.toString() + ", 心情 : " + feel;
	}
}

public class WeekTest {

	/*在TestWeek类中声明方法void printWeek(Week week)，根据参数值打印相应的中文星期字符串。
	然后以第2步中的枚举值调用printWeek方法，输出中文星期。*/
	public void printWeek(Week week) {
		switch (week) {
			case MON:
				System.out.println("星期一");
				break;
			case TUE:
				System.out.println("星期二");
				break;
			case WED:
				System.out.println("星期三");
				break;
			case THU:
				System.out.println("星期四");
				break;
			case FRI:
				System.out.println("星期五");
				break;
			case SAT:
				System.out.println("星期六");
				break;
			case SUN:
				System.out.println("星期日");
				break;
		}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (n < 1 || n > 7) {
			System.out.println("输入不合法");
			return;
		}
		Week[] values = Week.values();
		Week week = values[n - 1];
		System.out.println(week);

		new WeekTest().printWeek(week);
	}
}
