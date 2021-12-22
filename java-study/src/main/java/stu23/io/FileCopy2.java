package stu23.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:/windows/DPINST.LOG");
			fos = new FileOutputStream("test.log");
			byte[] buf = new byte[8192];
			int realCount = fis.read(buf);
			while (realCount != -1) {
				// 处理数据
				fos.write(buf, 0, realCount);
				// 继续读
				realCount = fis.read(buf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}
