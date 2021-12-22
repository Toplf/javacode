package stu24.thread;

/*
/*编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，
打印后将该整数放到集合中；
共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出；
在main线程中，唤醒上述睡眠的线程，使其尽快打印集合内容。
*/
public class ExerRunnerTest {

	public static void main(String[] args) {
		Runnable runner = new ExerRunner();
		Thread thread = new Thread(runner);
		thread.start();

		// 观察者不断的观察
		while (true) {
			if (((ExerRunner)runner).isOver()) { // 如果子线程的over为true, 说明了子线程的for执行完了.
				break;
			}
		}

		thread.interrupt();
	}
}
