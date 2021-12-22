package stu26.thread;

/**
 * 	银行有一个账户Account包含属性name, balance
 写一个普通 类Deposit实现Runnable, 在run方法中存钱
 有两个柜台(线程)分别同时向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。睡眠10毫秒

 问题：该程序是否有安全问题，如果有，如何解决？

 扩展练习 :
 一个柜台Deposit存3000元, 每次存1000,存3次
 另一个柜台Withdraw取3000元, 每次取1000,取3次
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("张三", 0);

		Runnable runner1 = new Deposit(account);
		Runnable runner2 = new Withdraw(account);

		Thread thread3 = new Thread(runner2);
		thread3.setName("取钱柜台1");
		thread3.start();

		Thread thread1 = new Thread(runner1);
		thread1.setName("存钱柜台1");
		//Thread thread2 = new Thread(runner1);
		//thread2.setName("存钱柜台2");

		thread1.start();
		//thread2.start();

	}
}
