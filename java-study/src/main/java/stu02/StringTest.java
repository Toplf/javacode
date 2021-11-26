class StringTest3 {



	public static void main(String[] args) {
		//String str1 = 4;        //判断对错：
		String str2 = 3.5f + "";             //判断str2对错：
		System.out.println(str2);        //输出：
		System.out.println(3+4+"Hello!");      //输出：
		System.out.println("Hello!"+3+4);      //输出：
		System.out.println('a'+1+"Hello!");    //输出：
		System.out.println("Hello"+'a'+1);            //输出：

	}
}

class StringTest2 {

	public static void main(String[] args) {
		String name = "张三";
		int age = 50;
		String address = "北京昌平区宏福苑";

		age = 30;
		// 再声明一个字符串, 用串接的方式,
		// 把数据串接到一个串中 "姓名 : xxx, 年龄 : xx, 地址 : xxxxxx";
		String details = "";
		//details = "姓名 : " + name + ", 年龄 : " + age + ", 地址 : " + address;
		details = details + "姓名 : " + name + ", ";
		details = details + "年龄 : " + age + ", ";
		details = details + "地址 : " + address;
		System.out.println(details);
	}
}

public class StringTest {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = null; // 空地址, 表示没有字符串
		String s3 = ""; // 空串, 串中没有内容

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// 字符串可以和任意数据做拼接, 拼接的结果是一个新的字符串, 内容是拼接后的新内容
		s1 = s1 + 100; // "abc100"
		System.out.println(s1);
		s1 = s1 + 3.22;
		s1 = s1 + "你好吗?";
		System.out.println(s1); // "abc1003.22你好吗?"
		s1 = s1 + 'A';
		s1 = s1 + false;
		System.out.println(s1);

		String s4 = "xxx";
		String s5 = "yyy";
		s4 = s4 + 30 + s5 + 5.22;
		System.out.println(s4); // "xxx30yyy5.22";

		int n1 = 923; // => "923"
		String s7 = "" + n1; // 把基本数据变成字符串

		String s8 = "284"; // => 284
		int n2 = Integer.parseInt(s8); // 把字符串变成真的整数
	}
}