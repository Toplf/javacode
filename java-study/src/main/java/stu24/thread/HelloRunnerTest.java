package stu24.thread;
/**
 * 		1) 写一个具体类, 实现Runnable接口, 并实现接口中的抽象方法run, 这个run方法就是线程体.
 * 		2) 创建这个具体类对象, 并把这个对象作为实参, 创建Thread线程对象.
 * 		3) 调用Thread线程对象的start方法.
 *
 */
public class HelloRunnerTest {

	public static void main(String[] args) {
		Runnable runner = new HelloRunner();
		Thread thread = new Thread(runner); // 对象关联, 创建一个新的栈
		thread.setName("子线程1");
		thread.start();

		Runnable runner2 = new HelloRunner2();
		Thread thread2 = new Thread(runner2);
		thread2.setName("子线程2");
		thread2.start();
	}

	public static void main2(String[] args) {
		Runnable runner = new HelloRunner();

		Thread thread = new Thread(runner); // 对象关联, 创建一个新的栈
		thread.setName("子线程");
		thread.start(); // 启动子线程,  激活栈, 并把run方法压入栈底
		//thread.run();

		Thread thread2 = new Thread(runner);
		thread2.setName("子线程2");
		thread2.start();

		Thread.currentThread().setName("主线程");
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "$$" + i);
		}
	}

	public static void main1(String[] args) {
		Runnable runner = new HelloRunner();

		Thread thread = new Thread(runner); // 对象关联, 创建一个新的栈
		thread.setName("子线程");
		thread.start(); // 启动子线程,  激活栈, 并把run方法压入栈底
		//thread.run();

		Thread.currentThread().setName("主线程");
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "$$" + i);
		}
	}
}
