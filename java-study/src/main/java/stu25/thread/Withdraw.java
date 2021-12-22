package stu25.thread;

public class Withdraw implements Runnable {

	private Account account;

	public Withdraw(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		// 取钱
		for (int i = 0; i < 3; i++) {
			synchronized ("") {
				if (account.getBalance() < 1000) {
					System.out.println("钱不够, 进入等待");
					try {
						"".wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int money = 1000;
				account.setBalance(account.getBalance() - money);
				System.out.println(Thread.currentThread().getName() + " 取钱后 : " + account);
			}
		}
	}

}
