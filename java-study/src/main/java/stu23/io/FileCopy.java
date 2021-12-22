package stu23.io;

import java.io.FileReader;
import java.io.FileWriter;


public class FileCopy {

	//编写程序FileCopy.java，在测试方法中，将FileCopy.java复制为FileCopy.java.bak文件；
	//查看FileCopy.java.bak文件的内容，验证复制是否正确。
	public static void main(String[] args) {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			//fileReader = new FileReader("./src/com/atguigu/javase/io/FileCopy.java"); // 这是一个完整的路径
			fileReader = new FileReader("恨不相逢未嫁时.mp3"); // 这是一个完整的路径
			fileWriter = new FileWriter("恨不相逢已嫁时.mp3");
			char[] buf = new char[100];
			// 以读为主导
			int realCount = fileReader.read(buf);
			while (realCount != -1) {
				// 1) 处理已经读的数据
				// 在处理已经读到的数据时, 写文件
				fileWriter.write(buf, 0, realCount);
				// 2) 继续读
				realCount = fileReader.read(buf);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (Exception e2) {
				}
			}

			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (Exception e2) {
				}
			}
		}
	}

}
