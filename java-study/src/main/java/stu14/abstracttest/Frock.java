package stu14.abstracttest;

public abstract class Frock {

	private int size;
	private String color;
	private double price;

	public Frock() {
	}

	public Frock(int size, String color, double price) {
		super();
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Frock [size=" + size + ", color=" + color + ", price=" + price + "]";
	}

	public abstract double calcArea();

}
