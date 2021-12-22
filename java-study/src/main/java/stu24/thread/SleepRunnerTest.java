package stu24.thread;

public class SleepRunnerTest {

	public static void main(String[] args) {
		Runnable runner = new SleepRunner();
		Thread thread = new Thread(runner);
		thread.start();

		try {
			Thread.sleep(21000); // 忍耐21秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.interrupt();
	}
}
