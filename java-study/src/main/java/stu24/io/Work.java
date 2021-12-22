package stu24.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Work {

	// 从键盘输入一些内容, 把内容保存成UTF8格式的文本文件content.txt
	// 直到键盘输入over命令, 或ctrl+z
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = null;
		BufferedReader bufferedReader = null;

		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bufferedWriter = null;

		try {
			isr = new InputStreamReader(is);
			bufferedReader = new BufferedReader(isr);

			fos = new FileOutputStream("content.txt");
			osw = new OutputStreamWriter(fos, "utf8");
			bufferedWriter = new BufferedWriter(osw);

			String line = bufferedReader.readLine();
			while (line != null) {
				// 1) 处理已经读的数据
				if (line.equalsIgnoreCase("over")) {
					break;
				}
				bufferedWriter.write(line);
				bufferedWriter.newLine();

				// 2) 继续读后面后面
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
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}
