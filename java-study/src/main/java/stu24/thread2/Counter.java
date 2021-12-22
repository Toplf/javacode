package stu24.thread2;


public class Counter implements Runnable {

	private int counter = 200;
	
	/*
	银行有一个账户Account包含属性name, balance
	写一个普通 类Deposit实现Runnable, 在run方法中存钱
	有两个柜台(线程)分别同时向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。睡眠10毫秒
	问题：该程序是否有安全问题，如果有，如何解决？
	*/

	@Override
	//public synchronized void run() { // 把整个方法都锁上, 不太好, 以this对象为锁对象
	public void run() {
		//synchronized (this) { // 锁的粒度太大
		for (int i = 0; i < 50; i++) {
			synchronized ("") { // ()中是一个锁对象, 任意对象都可以做锁, 称为互斥锁, 作用是只允许一个线程进入执行, 其他线程等待
				// 具有原子性, 不可分割
				counter -= 2;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " : " + counter);
			}

		}
	}

}
