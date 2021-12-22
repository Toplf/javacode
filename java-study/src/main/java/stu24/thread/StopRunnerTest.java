package stu24.thread;

public class StopRunnerTest {

	public static void main(String[] args) {
		Runnable runner = new StopRunner();
		Thread thread = new Thread(runner);
		thread.start();

		for (int i = 0; i < 2000000; i++) {
		}

		//thread.stop(); 禁止使用stop方法停止线程
		((StopRunner)runner).setFlag(false); // 以通知的方式停止线程
		System.out.println("主线程结束");

	}
}
