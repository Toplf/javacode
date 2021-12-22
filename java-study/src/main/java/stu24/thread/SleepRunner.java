package stu24.thread;

public class SleepRunner implements Runnable {

	private int i = 0;

	@Override
	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("在短睡时被打断, 无所谓");
			}
		}

		try {
			Thread.sleep(30 * 1000);
		} catch (InterruptedException e) {
			System.out.println("在长睡时被打断, 要你命!!!");
		}

		System.out.println("起来了");
	}


}
