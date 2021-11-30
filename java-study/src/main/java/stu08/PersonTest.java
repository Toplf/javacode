package stu08;

public class PersonTest {

	public static void main(String[] args) {
		Phone ph = new Phone("IOS", 5.5);
		Person p = new Person("张三", 30, "男", ph);

		p.call();
		p.msg();
		p.wechat();
	}
}