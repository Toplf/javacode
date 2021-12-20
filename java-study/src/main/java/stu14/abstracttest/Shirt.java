package stu14.abstracttest;

public class Shirt extends Frock {
	
	public Shirt() {
		super();
	}

	public Shirt(int size, String color, double price) {
		super(size, color, price);
	}

	@Override
	public double calcArea() {
		return getSize() * 1.3;
	}

}
