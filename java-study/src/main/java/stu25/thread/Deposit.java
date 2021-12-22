package stu25.thread;

public class Deposit implements Runnable {

	private Account account;

	public Deposit(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		//向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。睡眠10毫秒
		for (int i = 0; i < 6; i++) {
			synchronized ("") {
				int money = 500;
				account.setBalance(account.getBalance() + money);
				System.out.println(Thread.currentThread().getName() + " 存完钱后 : " + account);
				"".notify();
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
