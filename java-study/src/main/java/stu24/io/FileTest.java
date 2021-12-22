package stu24.io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("aaa/bbb/ccc/ddd/eee/fff");
		//file.createNewFile();
		//file.mkdir(); // 只能创建一层目录
		file.mkdirs();
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		File[] listFiles = file.listFiles(); // 列出目录下的所有子文件和子目录
		for (int i = 0; i < listFiles.length; i++) {
			System.out.println(listFiles[i]);
		}

		file.delete(); // 如果目录非空, 无法删除

		File file2 = new File("ttt");
		file2.delete(); // 可以删除空目录
	}

	public static void main2(String[] args) throws IOException {
		File file = new File("content.txt"); // file对应的是一个文件
		System.out.println("file.canExecute() : " + file.canExecute());
		System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath());
		System.out.println("file.getFreeSpace() : " + file.getFreeSpace());
		System.out.println("file.getName() : " + file.getName()); // 获取文件名
		System.out.println("file.getTotalSpace() : " + file.getTotalSpace());
		System.out.println("file.lastModified() : " + file.lastModified()); // 获取文件最后修改日期
		System.out.println("file.length() : " + file.length()); // 文件长度
		System.out.println("file.exists() : " + file.exists());
		System.out.println("file.isDirectory() : " + file.isDirectory()); // 是否是目录
		System.out.println("file.isFile() : " + file.isFile()); // 是否是文件
		file.createNewFile();
		//System.out.println("file.delete() : " + file.delete());
	}
}
