package stu25.thread;

class Counter implements Runnable {

	private int n = 1;

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			synchronized ("") {
				System.out.println(Thread.currentThread().getName() + " : " + n++);
				"".notify();
				if (i < 49) {
					try {
						"".wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}

public class WaitNotifyTest {

	public static void main(String[] args) {
		Runnable runner = new Counter();

		Thread thread1 = new Thread(runner);
		Thread thread2 = new Thread(runner);

		thread1.setName("线程1");
		thread2.setName("线程2");

		thread1.start();
		thread2.start();
	}
}
