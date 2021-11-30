package stu07;
public class Computer {

	private double cpu;
	private int memory;

	public Computer() {}

	public Computer(double cpu, int memory) {
		this.cpu = cpu;
		this.memory = memory;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getCpu() {
		return cpu;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getMemory() {
		return memory;
	}

	public String say() {
		return "CPU : " + cpu + "GHz, 内存 : " + memory + "G";
	}
}