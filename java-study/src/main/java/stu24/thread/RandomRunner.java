package stu24.thread;

public class RandomRunner implements Runnable {
	
	private boolean flag = true;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		while (flag) {
			System.out.println((int)(Math.random() * 100));
		}
	}

}
