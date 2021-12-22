package stu24.thread;

/**
 * 程序 : 可以执行的静态代码, 是保存在硬盘上的一个文件.
 * 进程 : 正在执行中的一个程序, 在内存中处于激活状态, 有生命周期
 * 线程 : 进程中的子任务.
 *
 * 创建并启动线程的方法 :
 * 	1) 实现的方式
 * 		1) 写一个具体类, 实现Runnable接口, 并实现接口中的抽象方法run, 这个run方法就是线程体.
 * 		2) 创建这个具体类对象, 并把这个对象作为实参, 创建Thread线程对象.
 * 		3) 调用Thread线程对象的start方法.
 *
 * 	2) 继承的方式
 * 		1) 写一个类, 继承自Thread, 并重写run方法, 此方法就是线程体
 * 		2) 创建这个类的对象, 相当于创建了线程对象
 * 		3) 调用这个线程对象的start方法.
 *
 * static Thread currentThread() 作用就是获取执行此方法所压入的栈的线程对象
 * void join() 它的作用是调用此方法的另一个线程阻塞, 当前线程执行完再执行另一个线程.
 * static void sleep(long millis) 作用是让当前线程(正在执行此方法的栈的线程) 进入睡眠状态一段时间
 *		解除sleep状态有两种途径, 睡的指定时间到了.
 *		被别的线程打断, 在别的线程中调用此线程对象的interrupt().
 */
class MyThread extends Thread {
	@Override
	public void run() { // 必须重写此方法, 才能有线程体执行.
		for (int i = 0; i < 100; i++) {
			System.out.println(currentThread().getName() + " : " + i);
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join(); // 令主线程阻塞, 子线程执行

		//sleep(2000);

		System.out.println("main...");
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
