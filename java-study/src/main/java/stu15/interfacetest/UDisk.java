package stu15.interfacetest;

public class UDisk implements USB {

	@Override
	public void connect() {
		System.out.println("U盘插入");
	}

	@Override
	public void work() {
		System.out.println("U盘工作中...");
	}

	@Override
	public void disconncet() {
		System.out.println("U盘弹出");
	}

}
