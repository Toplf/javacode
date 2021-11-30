package stu08;
//package 包名.子包名.子子包名.子子子包名;
//package 机构类型.机构名称.项目名称.模块名称;

//作用 : 告诉编译器, 当前源文件中的所有类生成.class文件后, 所有的.class文件要保存到的包目录结构.
//如果是同一个包的类, 可以直接使用.

// 一旦使用package, 有2个麻烦处
// 1) 使用package以后, 编译必须使用选项-d, javac空格-d空格目标目录(通常使用.) 源文件名
//		javac空格-d空格.空格 源文件名列表
// 2) 使用package以后, 在别的包中使用本类时, 必须使用全限定类名 : 包名.子包名.子子包名.子子子包名.类名

// 把当前目录中的.class全部删除
// 把Person类和Phone类打包到com.atguigu.javase.javabean包中
// 编译这两个源文件. javac -d . Person.java Phone.java
// 再把PersonTest类打包到com.atguigu.javase.test包中
// 修改测试类, 使用全限定类名来使用Person和Phone
// 编译测试类 javac -d . Person.java Phone.java PeronTest.java
// 运行测试类, java 测试类的全限定类名

/**
 对象关联, 一个对象关联另一个类的对象, 关联体现的是拥有关系
 如何关联, 在本类中把另一个类的对象作为我的属性即可.
 既然是属性, 需要修改全参构造, 提供get/set方法, 修改say

 属性是成员, 成员可以互访, 所以在本类中的任意位置都可以直接方便的使用这个对象

 JavaBean 可重用组件
 1) 类是公共的
 2) 有公共无参构造器
 3) 有属性, 有get/set 方法.
 */
public class Teacher {

	private String name;
	private int age;
	private String gender;
	private Computer myComputer; // 关联的对象

	public Teacher() {}

	public Teacher(String name, int age, String gender, Computer myComputer) { // 调整构造器
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.myComputer = myComputer;
	}

	public void setMyComputer(Computer myComputer) {
		this.myComputer = myComputer;
	}

	public Computer getMyComputer() {
		return myComputer;
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
		return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender + ", 我的电脑 : " + myComputer.say();
	}

	//public void lesson(Computer com) { // 对象的传递
	public void lesson() {
		System.out.println(name + "老师使用电脑[" + myComputer.say() + "]在上课"); // 在这里就可以使用关联的对象
	}

	public void jingdong() {
		System.out.println("使用电脑[" + myComputer.say() + "]上京东");
	}
}
