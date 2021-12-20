package stu15.interfacetest;

public abstract class Device {
	
	private static int no = 1;
	
	private final int ID;
	private String name;
	
	{
		ID = no++;
	}
	
	public Device() {
	}

	public Device(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Device [ID=" + ID + ", name=" + name + "]";
	}
	
	public abstract void startup();
	
	public abstract void shutdown();
	
}
