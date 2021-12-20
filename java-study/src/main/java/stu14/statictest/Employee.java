package stu14.statictest;

/**
 * 静态 : 确定的, 不会变化的. 和类相关
 * 非静态 :不确定的，　变化的  和对象相关
 *
 随着类的加载而加载
 优先于对象存在
 修饰的成员，被所有对象所共享
 访问权限允许时，可不创建对象，直接被类调用

 访问 :
 非静态成员之间可以直接互访,
 静态成员之间可以直接互访,
 非静态环境中可以直接访问静态成员.
 静态环境中不可以直接访问非静态成员, 要想访问必须先创建对象, 再通过对象访问.

 // 静态语句块, 类加载时执行仅有的一次	, 天生的给静态的空final初始化
 // 非静态语句块, 在创建对象时执行仅有的一次, 且先于构造器执行, 并且无论是执行哪个构造器, 非静态语句块都要执行 天生的给非静态的空final初始化
 *
 final 表示最终的, 完美的
 可以修饰类, 方法, 变量.
 final修饰类, 表明这个类是终极类, 不可以再被子类扩展. final类中一定重写了toString, hashCode, equals.
 final修饰方法, 表明这个方法是终极方法, 不可以被子类重写.
 final修饰量, 表明这个量是一个最终量, 它的特点是只能必须赋值一次,  不赋不行, 赋多也不行.

 public static final 修饰的量称为全局常量
 */
public class Employee {

	// 静态语句块, 静态代码块
	static {
		COMPANY = "atguigu";
		System.out.println("Employee static {}1...."); // 类加载时执行一次
		no = 100;
		//System.out.println(no);
	}

	// 共享数据, 被修饰的成员称为静态成员, 或 类成员
	// 静态属性 或 类变量, 和对象无关
	// 这是一个全局常量!!
	public static final String COMPANY;

	// 静态方法 或 类方法, 和对象无关
	public static void test() {
		System.out.println("公司 : " + COMPANY); // 静态成员之间可以直接互访
	}

	private static int no = 1; // 声明(永远最先执行), 显式赋值

	private static Employee e;

	public static void test2() {
		/*
		this.name = "艾弗森"; // 静态环境中不可以直接访问非静态成员. 不可以使用this关键和super关键字
		this.age = 20;
		this.salary = 20000;
		*/
		//e = new Employee();
		e.name = "某员工"; // 可以通过创建的对象来间接访问对象属性
		e.age = 20;
		e.salary = 20000;

		System.out.println(e);
	}

	static {
		System.out.println("Employee static {}2...."); // 类加载时执行仅有的一次
		no = 1000;
		System.out.println(no);
	}

	// 它的特点是只能必须赋值一次
	// 空final非常危险, 必须尽快完成一次赋值, 在构造器中为其完成一次赋值, 在所有构造器中都必须赋值.
	private final int id; // 员工号, 希望能自动生成
	private String name;
	private int age;
	private double salary;

	public Employee() {
		//this.id = no++;
	}
	//将Frock类中的serialNumber属性改为空final变量，并且仍然在构造器中为其赋值；
	//为serialNumber增加公有的set方法，确认是否能够编译通过？
	//去掉set方法，执行FrockTest 类的main方法，验证程序是否正确。
	public Employee(String name, int age, double salary) {
		//test();
		//this.id = no++; // 每个对象的id都可以被不同的no赋值, 可以自动生成的效果
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Employee(String, int, double)....");
	}

	{ // 非静态语句块, 在创建对象时执行仅有的一次, 且先于构造器执行, 并且无论是哪个构造器, 都不影响我的执行
		System.out.println("Employe {}....");
		this.id = no++;
	}

	public int getId() {
		return id;
	}

	/*
	public void setId(int id) {
		this.id = id; // 只能赋值一次
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

