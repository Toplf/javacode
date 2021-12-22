package stu24.thread2;

public class CounterTest {

	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread1 = new Thread(counter);
		thread1.setName("线程1");
		thread1.start();

		Thread thread2 = new Thread(counter);
		thread2.setName("线程2");
		thread2.start();
	}
}
