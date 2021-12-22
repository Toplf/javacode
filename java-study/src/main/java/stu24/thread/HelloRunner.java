package stu24.thread;
/**
 * 		1) 写一个具体类, 实现Runnable接口, 并实现接口中的抽象方法run, 这个run方法就是线程体.
 * 		2) 创建这个具体类对象, 并把这个对象作为实参, 创建Thread线程对象.
 * 		3) 调用Thread线程对象的start方法.
 *
 */
public class HelloRunner implements Runnable {

	private int i;

	@Override
	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "**" + i);
		}
	}

}
