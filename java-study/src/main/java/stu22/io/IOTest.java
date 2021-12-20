package stu22.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * 四个抽象基类
 * InputStream		字节输入流
 * OutputStream		字节输出流
 * Reader			字符输入流
 * Writer			字符输出流
 *
 * 读写文件步骤  :
 * 1) 打开流, 如果是读文本文件, 用FileReader, 写文本文件, 用FileWriter, 读二进制文件 用FileInputStream, 写二进制文件 FileOutputStream
 * 2) 通过流处理数据
 * 3) 关闭流
 */
public class IOTest {

	@Test
	public void test5() {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("一个文件");
			char[] buf = new char[100];
			int realCount = fileReader.read(buf); // 一次性读多个字符到数组中
			while (realCount != -1) {
				// 1) 处理已经读的数据
				for (int i = 0; i < realCount; i++) { // 只处理实际读到的字符数.
					System.out.print(buf[i]);
				}
				// 2) 继续读后面的数据
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
		}
	}

	@Test
	public void test4() {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("写一个文本文件"); // 如果文件不存在, 则会自动创建

			fileWriter.write('a');
			fileWriter.write('b');
			fileWriter.write('d');
			fileWriter.write('e');
			fileWriter.write('f');
			fileWriter.write(13);
			fileWriter.write(10);

			fileWriter.write('1');
			fileWriter.write('2');
			fileWriter.write('3');
			fileWriter.write('4');
			fileWriter.write('\r');
			fileWriter.write('\n');


			fileWriter.write('我');
			fileWriter.write('是');
			fileWriter.write('汉');
			fileWriter.write(13);
			fileWriter.write(10);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test3() {
		// 1) 声明引用, 初始化为null
		FileReader fileReader = null;
		// 2) try catch finally
		try {
			// 5) 创建流对象, 建立通道
			fileReader = new FileReader("一个文件");
			// 6) 处理数据
			int ch = fileReader.read();
			while (ch != -1) {
				// 处理已经读的数据
				System.out.print((char)ch);
				// 继续读后面的字符, 直至-1为止
				ch = fileReader.read();
			}
		} catch (Exception e) {
			// 4) 处理异常, 打印栈踪迹
			e.printStackTrace();
		} finally {
			// 3) 关闭流
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (Exception e2) {
				}
			}
		}

	}




	@Test
	public void test2() {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("一个文件");
			int ch = fileReader.read();
			while (ch != -1) {
				System.out.print((char)ch);
				ch = fileReader.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 为了保证一定能关闭它
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
				}
			}
		}
	}

	@Test
	public void test1() throws IOException {
		FileReader fileReader = new FileReader("一个文件"); // 在当前目录下读此文件, 项目目录才是当前目录
		int ch = fileReader.read(); // 读到的是字符的码值
		while (ch != -1) {
			System.out.print((char)ch);
			ch = fileReader.read();
		}
		fileReader.close();
	}
}
