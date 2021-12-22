package stu24.thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RandomRunnerTest {

	public static void main(String[] args) {
		Runnable runner = new RandomRunner();
		Thread thread = new Thread(runner);
		thread.start();

		//在main方法中创建并启动1个线程。线程循环随机打印100以内的整数，直到主线程从键盘读取了“Q”命令。
		Runnable runner2 = new KeyListener(runner);
		Thread thread2 = new Thread(runner2);
		thread2.setDaemon(true);
		thread2.start();
	}
}
