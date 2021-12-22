package stu24.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
/*编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，
打印后将该整数放到集合中；
共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出；
在main线程中，唤醒上述睡眠的线程，使其尽快打印集合内容。
*/
public class ExerRunner implements Runnable {

	// 提醒子线程, 此主存中的属性不要制作副本...
	private volatile boolean over = false;

	public boolean isOver() {
		return over;
	}

	@Override
	public void run() {
		List<Integer> list = new ArrayList<Integer>();
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

		System.out.println("睡起来后打印集合内容 : ");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
	}

}
