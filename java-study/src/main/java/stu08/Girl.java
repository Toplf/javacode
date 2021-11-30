package stu08;

public class Girl {

	private String name;

	public Girl() {}

	public Girl(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String say() {
		return "女孩, 姓名 : " + name;
	}

	public void marry(Boy boy) {
		System.out.println(this.say() + " 要嫁给 " + boy.say() + ", 嫁鸡随鸡!!");
	}

}