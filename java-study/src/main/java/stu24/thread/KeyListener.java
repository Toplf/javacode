package stu24.thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyListener implements Runnable {

	private Runnable runner;

	public KeyListener(Runnable runner) {
		this.runner = runner;
	}

	@Override
	public void run() {
		InputStream is = System.in;
		InputStreamReader isr = null;
		BufferedReader bufferedReader = null;
		try {
			isr = new InputStreamReader(is);
			bufferedReader = new BufferedReader(isr);
			String line = bufferedReader.readLine();
			while (line != null) {
				// 1) 处理已经读的数据
				if (line.equalsIgnoreCase("Q")) {
					((RandomRunner)runner).setFlag(false);
					//break; // 自我终结
				}
				// 2) 继续读后面的数据
				line = bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (Exception e2) {
				}
			}
		}
	}

}
