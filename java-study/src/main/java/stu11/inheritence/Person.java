package stu11.inheritence;

/**
 * 继承 : 从现有类创建子类, 现有类称为父类, 基类(子类以父类为基础进行扩展), 超类.
 * 子类继承父类的所有成员(构造器除外)
 * java允许多层继承, 但是不允许多重继承(一个类有多个直接父类)
 *
 * 	编写Computer类，包含double CPU、int 内存、int 磁盘等属性，getDetails方法用于返回Computer的详细信息
 编写PC子类，继承Computer类，添加特有属性(键盘)和方法(写代码)
 编写NotePad子类，继承Computer类，添加特有属性(卫星)和方法(导航)
 编写Test类，在main方法中创建PC和NotePad对象，分别访问对象中特有的属性、方法，
 以及从Computer类继承的属性和方法并打印输出。

 */
public class Person {

	String name;
	int age;
	String gender;

	public String say() {
		return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender;
	}
}
