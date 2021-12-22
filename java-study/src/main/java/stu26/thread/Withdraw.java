package stu26.thread;

public class Withdraw implements Runnable {

	private Account account;

	public Withdraw(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		// ȡǮ
		while (true) {
			synchronized ("") {
				int money = (int)(Math.random() * 10000);
				while (account.getBalance() < money) {
					System.out.println("Ҫȡ[" + money + "]. Ǯ²»¹», ½øȫµȴý");
					try {
						"".wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				account.setBalance(account.getBalance() - money);
				System.out.println(Thread.currentThread().getName() + " ȡǮº󠺠" + account);
			}
		}
	}

}
