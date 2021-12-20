package stu15.interfacetest;

public class Mouse extends Device implements USB {

	public Mouse() {
		super();
	}

	public Mouse(String name) {
		super(name);
	}

	@Override
	public void connect() {
		System.out.println("鼠标插入");
	}

	@Override
	public void work() {
		System.out.println("鼠标工作中....");
	}

	@Override
	public void disconncet() {
		System.out.println("鼠标拔出");
	}

	@Override
	public void startup() {
		System.out.println("鼠标启动");
	}

	@Override
	public void shutdown() {
		System.out.println("鼠标关闭");
	}

}