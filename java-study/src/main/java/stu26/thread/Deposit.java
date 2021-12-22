package stu26.thread;

public class Deposit implements Runnable {

	private Account account;

	public Deposit(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		while (true) {
			synchronized ("") {
				int money = (int)(Math.random() * 1000);
				System.out.println(Thread.currentThread().getName() + " 存钱之前 : " + account);
				account.setBalance(account.getBalance() + money);
				System.out.println(Thread.currentThread().getName() + " 存完钱后 : " + account);
				"".notify();
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
