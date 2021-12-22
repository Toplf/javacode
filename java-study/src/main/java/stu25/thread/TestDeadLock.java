package stu25.thread;

/**
 * 死锁 : 不要嵌套synchronized
 * 即使有嵌套, 锁对象尽量少
 */
public class TestDeadLock {
	static StringBuffer s1 = new StringBuffer();
	static StringBuffer s2 = new StringBuffer();

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				synchronized (s1) { // 可重入锁( 同一个线程可以无限次获取同一个锁)
					s2.append("A");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s2) {
						s2.append("B");
						System.out.print(s1);
						System.out.print(s2);
					}
				}
			}
		}.start();


		new Thread() {
			public void run() {
				synchronized (s2) {
					s2.append("C");
					synchronized (s1) {
						s1.append("D");
						System.out.print(s2);
						System.out.print(s1);
					}
				}
			}
		}.start();

	}
}
