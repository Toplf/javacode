package stu08;

public class Person {

	// 写一个类Person, name, age, gender.  call(), msg(), wechat().....
	// 使用对象关联技术完成, call, msg, wechat方法.
	private String name;
	private int age;
	private String gender;
	// 对象关联
	private Phone myPhone;

	public Person() {}

	public Person(String name, int age, String gender, Phone myPhone) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.myPhone = myPhone;
	}

	public void setMyPhone(Phone myPhone) {
		this.myPhone = myPhone;
	}

	public Phone getMyPhone() {
		return myPhone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public String say() {
		return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender + ", 我的手机 : " + myPhone.say();
	}

	public void call() {
		System.out.println("使用手机[" + myPhone.say() + "]打电话");
	}

	public void msg() {
		System.out.println("使用手机[" + myPhone.say() + "]发短信");
	}

	public void wechat() {
		System.out.println("使用手机[" + myPhone.say() + "]聊微信");
	}
}