package stu20.homework;

import org.junit.Test;

public class HomeWork {

	@Test
	public void work2() {
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);

		System.out.println(sb.length());// "null"

		System.out.println(sb);//

		StringBuffer sb1 = new StringBuffer(str); // 内部要使用到str的长度, 所以会出现空指针
		System.out.println(sb1);//
	}

	@Test
	public void work1() {
		/*获取两个字符串中最大相同子串。比如：
		   str1 = "abcwerthelloyuiodef ";str2 = "cvhellobnm"
		   提示：将短的那个串进行长度依次递减的子串与较长
		   的串比较。*/

		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnm";

		int ruler = str2.length();
		String sub = null;
		l1 : while (ruler > 0) { // 只要尺子不为0就循环
			// 用这个长度取子串
			int begin = 0; // 每次从短串中取子串, 总是从0开始取
			while (begin + ruler <= str2.length()) { // 以ruler为长度, 从短串中取子串.
				sub = str2.substring(begin, begin + ruler); // 保证子串的长度永远是ruler
				// 测试子串是否在长串中存在
				if (str1.indexOf(sub) != -1) {
					// 如果能, 总任务达成
					break l1;
				}
				begin++; // 如果没有找到, 则向右移动一位再取子串
			}
			// 长度变短
			ruler--;
		}
		if (ruler > 0) {
			System.out.println(sub);
		} else {
			System.out.println("没有最大相同子串");
		}
	}
}
