package stu24.thread;

public class StopRunner implements Runnable {

	private int count = 0;
	private boolean flag = true;

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean isFlag() {
		return flag;
	}

	@Override
	public void run() {
		while (flag) {
			System.out.println(count++);
			if (count == 200) {
				count = 0;
			}
		}
		System.out.println("关键代码");
	}



}
