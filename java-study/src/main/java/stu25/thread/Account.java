package stu25.thread;

public class Account {

	private String name;
	private double balance;

	public Account() {
	}

	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

}
