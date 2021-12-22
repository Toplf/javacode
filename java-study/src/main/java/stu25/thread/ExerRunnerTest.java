package stu25.thread;

/*
编写程序，在main方法中创建两个线程。线程1每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，打印后将该整数放到集合中；
共产生100个整数，全部产生后，睡眠30秒；
在线程2中，唤醒上述睡眠的线程1，并获取线程1中的集合并打印集合内容。
*/
public class ExerRunnerTest {

	public static void main(String[] args) {
		Runnable runner = new ExerRunner();
		Thread thread = new Thread(runner);
		thread.start();

		Runnable runner2 = new Observer(runner, thread); // 对象关联
		Thread thread2 = new Thread(runner2);
		thread2.start();
	}
}
