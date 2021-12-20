package stu12.inheritance;

/**
 * 	从现有类创建(衍生)子类, 现有类称为父类, 基类, 超类(在子类中使用super关键字表示父类)
 * 	子类会继承父类的所有成员(构造器除外), 包括私有的
 *
 * 	子类继承父类私有成员时, 父类必须提供公共的get/set方法用以间接使用这些成员.
 *
 * 	子类继承父类的语法  : class 子类 extends 父类 {}
 *
 * 	**方法覆盖(Override) : 在子类中重写从父类继承的方法, 因为父类的方法不能满足需要.
 * 	覆盖的条件
 * 		1) 父类中和子类中的方法的签名要完全一致, 方法签名包括 返回值类型 方法名(参数列表) 一致. 参数列表一致体现类型, 个数, 顺序都一致
 * 		2) 子类方法中的访问控制修饰符要大于等于父类的, 如果父类方法是public修饰, 子类只能必须public
 *
 * 	super表示超级的意思, 作用是特别指定后面的成员是从父类继承
 *
 * 	this表示当前对象, 是一个整体
 * 	super只是一个标识, 用于标识从父类继承的成员.
 *
 * 	// 注解 : 一种特殊的注释, 不仅可以被程序员查看, 还可以被编译器和JVM识别
 // @Override作用就是告诉编译器, 下面的方法要覆盖了, 请帮我做语法检查
 * 方法覆盖时必须使用注解
 *

 创建子类时会调用到父类的构造器

 如果在子类构造器中, 什么也没有时, 编译器会自动添加一个语句super(); 作用是直接调用父类的无参构造器
 如果在子类构造器中, 已经有super(); 编译就不加了.
 直接效果是, 子类的构造器一定会默认地调用父类的无参构造器.

 super()语句必须是构造器中的第一行. 目的是保证了父类构造器必须先执行.

 Implicit(隐式) super constructor Person() is undefined for default constructor. Must define an explicit(显式) constructor

 父类的无参构造器默认地会被所有子类调用. 所以在父类中提供无参构造器是非常重要而且必需的.

 关于构造器
 1) 所有类都必须要有构造器.
 2) 子类构造器中必须有先对父类构造器的调用!!!!, 子类构造器中第一行, 要么super(...) 要么this(...)
 1) 子类构造器中的第一行 可以是super(...) , 作用是直接显式的调用父类构造, 如果子类构造器中的是空的, 就和上面一样
 2) 子类构造器中的第一行 可以是this(...), 作用是调用本类重载构造器, 目的却是间接的调用父类构造器

 多态 : 子类对象的多种父类形态
 本态 : 子类对象的本类形态

 多态引用 : 子类对象赋值于父类类型的引用变量
 本态引用 : 子类对象赋值于本类类型的引用变量

 看右面 子类对象的多种父类形态
 看左面 父类类型的引用的多态性

 编译时类型(左边) 和 运行时类型(右边) 不一致时, 就出现了多态.

 */
public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("Person()....");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Person(String, int, String)...."); // 3
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sayHello() { // 虚拟方法 : 唯一的作用是骗过编译器
        System.out.println("打个招呼"); // 不执行
    }

    public String say() {
        return "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender;
    }
}
