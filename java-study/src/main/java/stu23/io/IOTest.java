package stu23.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

class Student implements Serializable {

	public static String school; // 序列化不可以序列化静态属性

	// 只序列化对象在GC区中的数据
	private int id;
	private String name;
	private int grade;
	private transient double score;

	public Student() {
	}

	public Student(int id, String name, int grade, double score) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
	}

}

public class IOTest {
	// 从键盘输入一些内容, 把文件保存成UTF8格式的文本文件content.txt
	// 直到键盘输入over命令, 或ctrl+z
	@Test
	public void test13() {
		InputStream is = System.in; // 以键盘为数据源
		InputStreamReader isr = null;
		BufferedReader bufferedReader = null;
		try {
			isr = new InputStreamReader(is);
			bufferedReader = new BufferedReader(isr);
			String line = bufferedReader.readLine();
			while (line != null) {
				// 1) 处理数据
				if (line.equals("exit")) {
					break;
				}
				System.out.println(line);
				// 2) 继续读
				line = bufferedReader.readLine(); // ctrl+z 提醒流数据已经结束
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

	@Test
	public void test12() {
		System.out.println("hello");
		System.err.println("Error");
	}

	@Test
	public void test11() {
		//FileWriter fileWriter = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bufferedWriter = null;
		try {
			//fileWriter = new FileWriter("一个文本文件");
			fos = new FileOutputStream("一个文本文件_UTF8", true); // 在创建节点流时, 传入第2个参数true,表示追加
			osw = new OutputStreamWriter(fos, "utf8"); // 在写文件时, 把字符串全部按照UTF8编码方式进行编码
			bufferedWriter = new BufferedWriter(osw);
			bufferedWriter.write("abc我和你");

			//bufferedWriter.flush(); // 把数据真的从缓冲区刷入硬盘

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close(); // 在关闭前会自动flush
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test10() {
		//FileReader fileReader = null; // 它太弱了, 不好用
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bufferedReader = null;
		try {
			//fileReader = new FileReader("HashMap.java"); // 只能处理和项目一致的编码的文本文件
			fis = new FileInputStream("HashMap.java");
			//isr = new InputStreamReader(fis); // 在这里仍然使用的是默认编码方式
			isr = new InputStreamReader(fis, "utf8"); // 指明转换流在处理字节数据时按照UTF8编码方式处理字符串
			bufferedReader = new BufferedReader(isr);

			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
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

	@Test
	public void unserialize() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("对象序列化");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			/*
			Object obj1 = ois.readObject();
			Object obj2 = ois.readObject();
			Object obj3 = ois.readObject();

			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);

			System.out.println(Student.school);
			*/

			/*
			Student[] arr = (Student[])ois.readObject();
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			*/

			List<Student> list = (List<Student>)ois.readObject();
			Iterator<Student> iterator = list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void serialize() {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("对象序列化");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			Student s1 = new Student(1, "小明", 3, 90);
			Student s2 = new Student(2, "小花", 1, 80);
			Student s3 = new Student(3, "小丽", 4, 20);

			s1.school = "atguigu";

			//oos.writeObject(s1);
			//oos.writeObject(s2);
			//oos.writeObject(s3);

			//Student[] arr = {s1, s2, s3};
			//oos.writeObject(arr);

			List<Student> list = new ArrayList<Student>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			oos.writeObject(list);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test8() throws UnsupportedEncodingException {
		// e6 88 91 可变长度编码
		int n1 = 0x6211; // Unicode码是国际标准委员会制定
		System.out.println(n1);
		System.out.println((char)n1);

		int n2 = 0xCED2; // GBK码值, 是中国人自己制定
		System.out.println(n2);

		// 编码 : 字符串 => 字节数组, string.getBytes(), 目标是把字符串保存到文件中或通过网络传输.
		String string = "abc我和你";
		byte[] bytes1 = string.getBytes("gbk"); // 按照项目默认的编码方式: GBK编码方式进行编码
		for (int i = 0; i < bytes1.length; i++) {
			System.out.print(Integer.toHexString(bytes1[i]) + " ");
		}
		System.out.println();

		byte[] bytes2 = string.getBytes("utf8");
		for (int i = 0; i < bytes2.length; i++) {
			System.out.print(Integer.toHexString(bytes2[i]) + " ");
		}
		System.out.println();

		// 解码 : 字节数组 => 字符串, new String(byte[]), 把文件中或从网络接收的数据还原成字符串
		String string2 = new String(bytes1, "gbk"); // 把字节数组按照gbk编码方式进行解码
		// 每2个字节凑一个整数, 是GBK码, 再查表找到对应的Unicode码
		System.out.println(string2);

		String string3 = new String(bytes2, "utf8");
		// 每3个字节凑一个字符, 从3个字节中拆出数据, 拆出的数据直接就是Unicode
		System.out.println(string3);
	}

	@Test
	public void test9() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("对象输出流文件2");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			int readInt = ois.readInt();
			System.out.println(readInt);
			boolean readBoolean1 = ois.readBoolean();
			boolean readBoolean2 = ois.readBoolean();
			System.out.println(readBoolean1);
			System.out.println(readBoolean2);
			long readLong = ois.readLong();
			System.out.println(readLong);
			double readDouble = ois.readDouble();
			System.out.println(readDouble);
			String readUTF = ois.readUTF(); // 读文件要解码
			System.out.println(readUTF);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test7() {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("对象输出流文件2");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			oos.writeInt(10);
			oos.writeBoolean(false);
			oos.writeBoolean(true);
			oos.writeLong(20);
			oos.writeDouble(3.14);
			oos.writeUTF("abc我和你xxx"); // 写文件要编码
			//oos.writeChars("abc我和你xxx"); // 把字符串直接写文件

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test6() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("对象输出流文件");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			int readInt = ois.readInt();
			System.out.println(readInt);
			boolean readBoolean1 = ois.readBoolean();
			boolean readBoolean2 = ois.readBoolean();
			System.out.println(readBoolean1);
			System.out.println(readBoolean2);
			long readLong = ois.readLong();
			System.out.println(readLong);
			double readDouble = ois.readDouble();
			System.out.println(readDouble);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	// 使用对象流写文件, 写入50个100以内的随机整数
	@Test
	public void exer1() {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("50个随机数");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			for (int i = 0; i < 50; i++) {
				oos.writeInt((int)(Math.random() * 100));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e2) {
				}
			}
		}
	}
	// 使用对象输入流读取这50个随机整数
	@Test
	public void exer2() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("50个随机数");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			for (int i = 0; i < 50; i++) {
				System.out.println(ois.readInt());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test5() {
		// ObjectInputStream和ObjectOutputStream
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("对象输出流文件");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			oos.writeInt(10); // 数据在内存中如何 保存 它就如何写入文件
			oos.writeBoolean(false);
			oos.writeBoolean(true);
			oos.writeLong(20);
			oos.writeDouble(3.14);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test4() {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter("使用缓冲流写文本");
			bufferedWriter = new BufferedWriter(fileWriter);
			String[] content = {"来上一些字符串内容1",
			"来上一些字符串内容2",
			"来上一些字符串内容3",
			"来上一些字符串内容4",
			"来上一些字符串内容5",
			"来上一些字符串内容6",
			"来上一些字符串内容7",
			"来上一些字符串内容8",
			"1234567890123456",
			"asdfkjasldfjalksdjflaksjdflkasjdflkasjdff",
			"xcvadsfasdfasdfasdfasdf"};
			for (String string : content) {
				bufferedWriter.write(string);
				bufferedWriter.newLine(); // 最有价值方法
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test3() {
		// 使用缓冲流(处理流)
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			// 包装流, 使用对象关联, 包装流把节点流对象关联为属性.
			fileReader = new FileReader("HashMap.java");
			bufferedReader = new BufferedReader(fileReader);
			// 最有价值方法
			String line = bufferedReader.readLine(); // 读到的字符串没有换行
			int num = 1;
			while (line != null) {
				// 处理读到的行
				System.out.println(num++ + " " + line);
				// 继续读后面的行, 直到null
				line = bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 只需要关闭高级流, 因为低级流被关联, 并且会在关闭高级流时自动关闭
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	@Test
	public void test2() {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("写一个文件");
			// 写数组
			String[] content = {"来上一些字符串内容1",
			"来上一些字符串内容2",
			"来上一些字符串内容3",
			"来上一些字符串内容4",
			"来上一些字符串内容5",
			"来上一些字符串内容6",
			"来上一些字符串内容7",
			"来上一些字符串内容8",
			"1234567890123456",
			"asdfkjasldfjalksdjflaksjdflkasjdflkasjdff",
			"xcvadsfasdfasdfasdfasdf"};
			for (int i = 0; i < content.length; i++) {
				char[] charArray = content[i].toCharArray();
				//fileWriter.write(charArray);// 直接把一个数组的全部内容写入到输出流中
				//这是超重点方法, 把数组的一部分写入文件
				fileWriter.write(charArray, 1, charArray.length - 1); // 第2个参数是offset偏移, 第3个参数是length长度

				fileWriter.write(13); // 写回车
				fileWriter.write(10); // 写换行
			}
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

	//使用缓冲区读文件, 要求在每一行前面加上行号
	@Test
	public void test1() {
		int line = 1;
		System.out.print(line++ + " ");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("HashMap.java");
			char[] buf = new char[8192];
			int realCount = fileReader.read(buf);
			while (realCount != -1) {
				// 1) 处理已经实际读到的数据
				for (int i = 0; i < realCount; i++) {
					System.out.print(buf[i]);
					if (buf[i] == 10) {
						System.out.print(line++ + " ");
					}
				}
				// 2) 继续读后面的数据, 直到-1为止
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
}
