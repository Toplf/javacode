package stu25.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerRunner implements Runnable {

	// 提醒子线程, 此主存中的属性不要制作副本...
	private volatile boolean over = false;
	private List<Integer> list = new ArrayList<Integer>();

	public boolean isOver() {
		return over;
	}

	public List<Integer> getList() {
		return list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			int rand = (int)(Math.random() * 100);
			System.out.println(rand);
			list.add(rand);

			int time = (int)(Math.random() * 200);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				System.out.println("在短睡时被打断, 无所谓");
			}
		}
		over = true;

		System.out.println("要睡30秒了");
		try {
			Thread.sleep(30 * 1000);
		} catch (InterruptedException e) {
			System.out.println("在长睡时被打断.... 很生气");
		}

		System.out.println("睡起来后 ");
	}

}
