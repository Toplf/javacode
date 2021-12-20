package stu14.statictest;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("张三", 30, 3000);
		Employee emp2 = new Employee("李四", 40, 4000);
		Employee emp3 = new Employee("王五", 50, 5000);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

		Employee emp4 = new Employee();
		System.out.println(emp4);
	}

	public static void main2(String[] args) {
		//Employee ee = new Employee();
		//ee.test2(); // 虽然通过对象调用类方法是可以的, 但是在静态方法中仍然没有this, 在静态方法中只能使用类成员.
	}

	public static void main1(String[] args) {
		// 静态成员因为不需要对象, 所以使用简单.
		System.out.println(Employee.COMPANY);
		//Employee.test();
		//Employee.company = "尚硅谷";
		Employee.test();

		Employee emp1 = new Employee("张三", 30, 3000);
		Employee emp2 = new Employee("李四", 40, 4000);
		Employee emp3 = new Employee("王五", 50, 5000);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}

