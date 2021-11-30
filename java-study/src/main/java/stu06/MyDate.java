package stu06;

public class MyDate {

	// 写一个类MyDate, int year, int month, int day
	int year;
	int month;
	int day;

	// 写一个String say(), 返回一个字符串, 内容是对象的详细信息, 就是所有属性值的拼接
	public String say() {
		String str = year + "年" + month + "月" + day + "日";
		return str;
	}

}