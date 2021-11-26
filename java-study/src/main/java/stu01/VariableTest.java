package stu01;
public class VariableTest {

	public static void main(String[] args) {
		// 变量是内存中的一块区域, 区域中可以保存一个数据
		// 声明 : 数据类型 变量名;
		int var1; // 在内存中开辟一块空间(4字节), 空间中可以保存整数
		// 变量的赋值
		var1 = 10; // 把10这个值写入var1变量名代表的内存空间中.
		System.out.println(var1);

		int var2 = var1;
		System.out.println(var2);

		var1 = var1 * var2; // 赋值操作
		System.out.println(var1);
	}
}