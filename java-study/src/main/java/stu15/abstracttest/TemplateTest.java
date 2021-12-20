package stu15.abstracttest;

abstract class Template {
	// 确定的部分
	public final void getTime() {
		long start = System.currentTimeMillis(); // 获取当前时间距离1970-1-1 0:0:0.000所经过毫秒数
		code();
		long end = System.currentTimeMillis();
		System.out.println("执行时间是：" + (end - start));
	}

	// 不确定的部分
	public abstract void code();
}

class SubTemplate extends Template {

	@Override public void code() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
}

class SubTemplate2 extends Template {

	@Override public void code() {
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}
	}
}

public class TemplateTest {
	public static void main(String[] args) {
		Template tmp1 = new SubTemplate();
		tmp1.getTime();

		tmp1 = new SubTemplate2();
		tmp1.getTime();
	}
}