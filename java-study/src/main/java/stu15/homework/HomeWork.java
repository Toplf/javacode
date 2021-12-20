package stu15.homework;

//�����������С��ʺš��������롱����������������ʡ�������С�����˺�Ҫ�Զ����ɡ����Ҳ������޸�
class BankAccount {
	
	private static double rate;
	private static double minBalance;
	private static long accountBase = 6222020200012345678L;
	
	public static void setRate(double rate) {
		BankAccount.rate = rate;
	}
	
	public static void setMinBalance(double minBalance) {
		BankAccount.minBalance = minBalance;
	}
	
	public static double getRate() {
		return BankAccount.rate;
	}
	
	public static double getMinBalance() {
		return minBalance;
	}
	
	//////////////////////////////////////////////////////////////////////////////////
	
	private final long account;
	private String password; 
	private double balance;
	
	{
		this.account = accountBase++;
	}
	
	public BankAccount() {
	}

	public BankAccount(String password, double balance) {
		this.password = password;
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccount() {
		return account;
	}
	
	@Override
	public String toString() {
		return "�˺� : " + account + ", ���� : " + password + ", ��� : " + balance;
	}
	
	
}

public class HomeWork {
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("123456", 500000);
		BankAccount account2 = new BankAccount("666666", 500);
		BankAccount account3 = new BankAccount("888888", 5);
		
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		
		BankAccount.setMinBalance(10);
		BankAccount.setRate(0.05);
		
		System.out.println("���� : " + BankAccount.getRate());
		System.out.println("��С��� : " + BankAccount.getMinBalance());
	}
}
