package stu19.string;

import org.junit.Test;

/**
 * 字符串 : 内容不可改变的Unicode字符的序列, 任何的对字符串的修改都一定会产生新的字符串对象.
 * 底层使用了char[]来保存字符, 字符串的处理和下标密切相关.
 * 					0 2         12       17        23        29      37 39
 * String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
 *
 * 	*****public int length() 获取字符串长度(字符数) string.length() => 40
 *****public char charAt(int index) 获取参数指定的下标位置处的字符 string.charAt(10) => y. string.charAt(13) => 喜
 public char[] toCharArray() 获取字符串相应的字符数组, 是内部数组的一个副本
 System.arraycopy(value, 0, result, 0, value.length);
 // 第一个参数是源数组,
 * 第2个参数是源数组开始下标
 // 第3个参数是目标数组,
 * 第4个参数是目标数组的开始复制的下标,
 * 第5个参数是总共要复制的元素个数.
 *
 效果相当于 :
 for (int i = 0; i < value.length; i++) {
 result[i] = value[i];
 }

 ****public boolean equals(Object anObject)
 public int compareTo(String anotherString)

 * 					0 2         12       17        23        29      37 39
 * String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
 *
 ***public int indexOf(String s), 获取参数中的子串在当前字符串中首次出现的下标值 string.indexOf("喜欢") => 13, 如果搜索失败返回-1
 public int indexOf(String s ,int startpoint) 获取第2个喜欢 : string.indexOf("喜欢", 14) => 18,
 获取第3个喜欢 : string.indexOf("喜欢", 19) => 25,

 public int lastIndexOf(String s) 从右向左搜索子串出现的下标, string.lastIndexOf("喜欢") => 25
 public int lastIndexOf(String s ,int startpoint) 获取第2个喜欢 : string.lastIndexOf("喜欢", 24) => 18

 // 通常获取文件列表名, 对文件名进行判断
 *public boolean startsWith(String prefix) 判断字符串是否以参数中的子串为开始 string.startsWith("  abc") => true
 *public boolean endsWith(String suffix) 判断字符串是否以参数中的子串为结束 string.endsWith("123") => false

 *****public String substring(int start,int end) 从当前字符串中截取子串, start表示开始下标(包含), end表示结束下标(不包含)
 string.substring(12, 16) => "我喜欢你",  结束下标-开始下标 == 子串长度
 public String substring(int startpoint) 从当前字符串中取子串,从start开始到结束

 public String replace(char oldChar,char newChar) 替换字符串中的所有旧字符为新字符
 public String replaceAll(String old,String new) 全部替换老串为新串, 特殊字符 \ [ * +

 public String trim() 修剪字符串的首尾的空白字符(码值小于等于32的字符)

 public String concat(String str)
 public String toUpperCase() 改变大小写
 public String toLowerCase()
 public String[] split(String regex) 以参数中的子串为切割器, 把字符串切割成多个部分.
 *****public boolean equalsIgnoreCase(String s2) 比较字符串的内容, 忽略大小写
 *
 */
public class StringTest {

	@Test
	public void test11() {
		String s1 = "abc";
		String s2 = "ABc";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

	@Test
	public void exer5() {
		String path = "D:\\MyWork\\Program\\jdk1.8.0_221\\bin;C:\\Program Files (x86)\\NetSarang\\Xftp 6\\;C:\\Program Files (x86)\\NetSarang\\Xshell 6\\;D:\\MyProgram\\Database\\Oracle\\MyOracle11G\\product\\11.2.0\\dbhome_1\\bin;C:\\MyProgram\\_MyBin;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;D:\\MyProgram\\LLVM\\bin;D:\\MyProgram\\CMake\\bin;C:\\Program Files\\Git\\cmd";
	}

	@Test
	public void test10() {
		String string = "abc,你好吗,不好,12345,qqqq";
		String[] split = string.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

	@Test
	public void test9() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		String upperCase = string.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = string.toLowerCase();
		System.out.println(lowerCase);
	}

	//模拟一个trim方法，去除字符串两端的空白字符。
	@Test
	public void exer4() {
		//String string = " \r\n\t   \t\r\nabcdefgh  你好吗 123\r\t\n\b\n\r\t";
		String string = " \r\n\t   \t\r\n                            \r\t\n\b\n\r\t";
		int begin = 0;
		int end = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch > 32) {
				begin = i;
				break;
			}
		}
		for (int i = string.length() - 1; i >= 0; i--) {
			char ch = string.charAt(i);
			if (ch > 32) {
				end = i;
				break;
			}
		}
		if (begin == 0 && end == 0) {
			System.out.println("");
		} else {
			String substring = string.substring(begin, end + 1);
			System.out.println(substring);
		}
	}

	@Test
	public void test8() {
		String string = " \r\n\t   \t\r\nabcdefgh  你好吗 123\r\t\n\b\n\r\t";
		System.out.println(string);

		String trim = string.trim();
		System.out.println(trim);
	}

	@Test
	public void test7() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		String replace = string.replace(' ', '#');
		System.out.println(replace);

		String replaceAll = string.replaceAll("喜欢", "讨厌");
		System.out.println(replaceAll);

		// 消除字符串中所有空格
		String replaceAll2 = string.replaceAll(" ", "");
		System.out.println(replaceAll2);
	}

	//将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
	public static String partReverse(String string, int begin, int end) {
		// 把字符串切成3段
		String s1 = string.substring(0, begin);
		String s2 = string.substring(begin, end);
		String s3 = string.substring(end);
		// 只反转中间的部分
		char[] arr = s2.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		s2 = new String(arr);
		// 再拼接
		String result = s1 + s2 + s3;
		return result;
	}

	@Test
	public void exer3() {
		String string = "abcdefghijklmn";
		int begin = 2; // 包含
		int end = 6; // 不包含
		System.out.println(partReverse(string, begin, end));
	}

	@Test
	public void test6() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		String substring = string.substring(12, 16);
		System.out.println(substring);
		String substring2 = string.substring(12, string.length()); // 从12开始一直取到末尾
		System.out.println(substring2);

		String substring3 = string.substring(12);
		System.out.println(substring3);
	}

	@Test
	public void test5() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		System.out.println(string.startsWith("  abc"));
		System.out.println(string.endsWith("123  "));
	}


	/*获取一个字符串在另一个字符串中出现的次数。
       比如：获取"ab"在 "abkkcadkabkebfkabkskab"
       中出现的次数*/
	public static int getCount(String s1, String s2) {
		if (s2.length() > s1.length()) {
			String tmp = s1;
			s1 = s2;
			s2 = tmp;
		}
		int count = 0;
		int index = 0;
		while (true) {
			index = s1.indexOf(s2, index);
			if (index == -1) {
				break;
			}
			count++;
			index++;
		}
		return count;
	}

	@Test
	public void exer2() {
		String s1 = "abkkcadkabkebfkabkskab";
		String s2 = "ab";
		System.out.println(getCount(s2, s1));
	}


	@Test
	public void test4() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		int indexOf = string.indexOf("ABXX");
		System.out.println(indexOf);
		int indexOf2 = string.indexOf("ABC");
		System.out.println(indexOf2);
	}

	// 反转字符串
	@Test
	public void exer14() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++) {
			// i和length-1-i
			char tmp = charArray[i];
			charArray[i] = charArray[charArray.length - 1 - i];
			charArray[charArray.length - 1 - i] = tmp;
		}
		String string2 = new String(charArray);
		System.out.println(string2);

		System.out.println(string);
	}

	@Test
	public void exer13() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		String str = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			str = ch + str;
		}
		System.out.println(str);
	}

	@Test
	public void exer12() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		String str = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(string.length() - 1 - i);
			str += ch;
		}
		System.out.println(str);
	}

	@Test
	public void exer1() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		String str = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			char ch = string.charAt(i);
			str += ch;
		}
		System.out.println(str);
	}

	@Test
	public void test3() {
		String string = "  abcABXXyy 我喜欢你,你喜欢我吗?我不喜欢你 qqyyZZ123  ";
		System.out.println(string.length());
		char ch1 = string.charAt(5); // string[5]
		System.out.println(ch1);

		// 遍历字符串
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			System.out.println(ch);
		}
	}

	@Test
	public void test2() {
		String s2 = new String();
		String s3 = "";

		char[] arr = {'a', '1', '大', 'C', '好'};
		String s4 = new String(arr); // 把字符数组直接变成字符串
		System.out.println(s4);

		String s5 = new String(arr, 2, 3); // 把字符数组的一部分变成字符串, 第2个参数是开始下标, 第3个参数是取的字符数
		System.out.println(s5);

	}

	@Test
	public void test1() {
		String s1 = "abc";
		s1 = s1 + 100; // s1 + 100 产生一个新的字符串
		for (int i = 0; i < 10000; i++) {
			s1 += i;
		}


	}
}
