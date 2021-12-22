package stu25.thread;

import java.util.List;

public class Observer implements Runnable {

	private Runnable runner;
	private Thread thread;

	public Observer(Runnable runner, Thread thread) {
		this.runner = runner;
		this.thread = thread;
	}

	@Override
	public void run() {
		// 观察者不断的观察
		while (!((ExerRunner)runner).isOver());
		thread.interrupt();

		// 获取集合
		List<Integer> list = ((ExerRunner)runner).getList();
		for (Integer integer : list) {
			System.out.println("观察者 : " + integer);
		}
	}


}
