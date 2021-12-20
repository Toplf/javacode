package stu17.exception;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 异常 : 程序在运行时有可能出现的非正常状况, 会导致程序崩溃
 * 分类 :
 * 	按照程度来分 :
 * 		Error : 虚拟机都无法处理的错误状况
 * 		Exception : 一般性的问题
 *
 * 	按照处理方式来分 :
 * 		受检异常 : 在程序中必须对其进行处理的异常, 如果不处理,编译出错.
 * 			Exception及其子类, RuntimeException及其子类除外 : 问题程序不容忽视
 *
 * 		非受检异常 : 在程序中不是必须对其进行处理的异常.
 * 			Error及其子类 : 太严重了
 * 			RuntimeException及其子类 : 太轻微了.
 *
 *	为了避免程序崩溃, 应该对异常进行处理
 *		1) 捕获 try catch finally
 *			try {
 *				可能抛出异常的语句, 如果真的出现了异常, 会导致try中后面的语句不能执行
 *			} catch (可能的异常类型1 引用) { // 如果真的出现了异常, 就执行catch
 *				通过引用处理异常对象
 *			} catch (可能的异常类型2 引用) {
 *			} catch (可能的异常类型3 引用) {
 *			} ....
 *			} catch (Exception e) {
 *				// 补漏
 *			} finally {
 *				// 通常在这里做释放不在GC区中的资源的操作, 为了保证不会发生资源泄漏, 所以在这里释放.
 *			}
 *
 *			组合 :
 *				try catch
 *				try catch finally
 *				try finally
 *
 *		2) 抛出 : 在签名中使用throws 可能的异常类型列表 , 警告调用者, 调用此方法有风险, 请考虑清楚
 *			在方法中使用throw 异常对象, 方法一旦执行了throw 和执行return效果是一样的, 都会导致方法结束
 *			return 是正常结束返回, throw 是异常结束返回
 *			方法中的throw作用是真的产生破坏
 *
 *		3) 先捕获再抛出 : 把各种已知未知的异常全部包装为自定义异常, 便于统一处理.
 *			在方法中先尝试执行某代码, 如果真的出现了异常, 再把这个异常关联到自定义异常对象中. 再抛出自定义异常对象
 *
 *	知识回顾 :
 *		方法覆盖 : 子类重写父类的方法
 *		覆盖条件 :
 *			1) 返回值类型(子类方法返回值类型小于等于父类), 方法名, 参数列表要一致(签名)
 *			2) 子类的覆盖方法的访问控制修饰符要大于等于父类的.
 *			3) 覆盖方法不可以被private, static, final修饰
 *			4) 子类的覆盖方法抛出受检异常小于等于父类方法抛出的受检异常
 *
 *	异常处理的选择 :
 *		这个方法出问题会不会影响栈
 *		入口方法尽量捕获,
 *		普通方法尽量抛出
 *
 *	如果代码中有潜在风险, 尽量先捕再抛
 *	如果代码中没有风险, 但是有时不满足方法继续的条件时, 直接抛出.
 */
// 自定义异常, 必须继承Exception, 并提供两个构造器, 这是受检异常
class DividedByZeroException extends Exception {

	public DividedByZeroException(String message) { // 传递异常消息
		super(message);
	}

	public DividedByZeroException(Throwable cause) {
		super(cause);
	}
}

public class ExceptionTest {

	public static int divide(int x, int y) throws DividedByZeroException {
		try {
			return x / y;
		} catch (ArithmeticException e) {
			throw new DividedByZeroException(e); // 包装已知异常
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(divide(10, 2));
			System.out.println(divide(10, 0));
		} catch (DividedByZeroException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

	public static int divide3(int x, int y) throws DividedByZeroException {
		if (y == 0) {
			throw new DividedByZeroException("自定义异常 => 被0除错误!!!"); // 必须处理
		}
		return x / y;
	}

	public static void main3(String[] args) {
		System.out.println("main begin");
		try {
			System.out.println(divide3(10, 2));
			System.out.println(divide3(10, 0));
		} catch (DividedByZeroException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("main end");
	}

	/**
	 * 获取两个数的商
	 * @param x
	 * @param y
	 * @return
	 */
	public static int divide2(int x, int y) {
		if (y == 0) {
			RuntimeException runtimeException = new RuntimeException("我是异常, 出现被0除错误!!!");
			throw runtimeException;
		}
		return x / y;
	}

	public static void main2(String[] args) {
		System.out.println("main begin");

		try {
			System.out.println(divide2(10, 2));
			System.out.println(divide2(10, 0));
		} catch (RuntimeException e) {
			System.out.println(e);
		}

		System.out.println("main end"); // 核心
	}

	public static void main1(String[] args) {
		System.out.println("main begin");

		try {
			int n = Integer.parseInt(args[0]);
			System.out.println("n : " + n);
			int[] arr = null;
			//System.out.println(arr.length);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage()); // 获取异常消息字符串
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 打印栈踪迹
		} catch (Exception e) { // 捕获任意其他异常, 万能夹
			System.out.println(e);
		} finally { // 最终地, 末了地
			System.out.println("无论前面try catch发生了什么, 都要执行finally....");
		}

		System.out.println("main end"); // 核心代码
	}
}
