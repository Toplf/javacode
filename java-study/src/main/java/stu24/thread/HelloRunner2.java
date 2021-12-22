package stu24.thread;

public class HelloRunner2 implements Runnable {

	private int i = 0;
	
	@Override
	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "$$" + i);
		}
	}

}
