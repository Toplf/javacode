package com.luof.oop.polymorphism;

public class Computer {

	private double cpu;
	private int memory;
	private int disk;
	private double price;

	public Computer() {
	}

	public Computer(double cpu, int memory, int disk, double price) {
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getDisk() {
		return disk;
	}

	public void setDisk(int disk) {
		this.disk = disk;
	}

	public String getDetails() {
		return "CPU : " + cpu + "GHz, 内存 : " + memory + "G, 磁盘 : " + disk + "G, 价格 : " + price;
	}
}