package stu15.interfacetest;

/**
 * 代理模式 : 把代理对象当成被代理对象来使用
 *
 * 使用场景1 : 无法直接使用被代理对象时.
 * 使用场景2 : 增强被代理对象的方法, 同时又不能修饰被代理类, 通过代理类增强业务方法
 */
interface HouseRent { // 业务接口最重要, 统一代理类和被代理类及客户.
	void rent();
}
class FangDong implements HouseRent {

	@Override
	public void rent() {
		System.out.println("我有房子要出租, 是刚装修的婚房, 请爱护, 房租转账:23423423");
	}
}

class FangDong2 implements HouseRent {

	@Override
	public void rent() {
		System.out.println("我有房子要出租, 刚死了2个人, 晚上要小心!!");
	}
}

class LianJia implements HouseRent {

	// 关联被代理对象
	private HouseRent fd = new FangDong(); // 原始方法调用依赖的对象

	@Override
	public void rent() {
		// 准备租房子
		System.out.println("请交中介费20000"); // 对原始方法调用的增强1
		fd.rent(); // 被代理对象的方法调用, 这就是切面, AOP面向切面编程
		System.out.println("及时交房租, 不交就赶出去...., 可以支持微信支付宝 134232");// 对原始方法调用的增强2
	}
}


public class ProxyTest {

	public static void main(String[] args) {
		// 客户要租房
		//new FangDong();
		HouseRent hr = new LianJia(); // 面向接口编程
		hr.rent();

	}
}
