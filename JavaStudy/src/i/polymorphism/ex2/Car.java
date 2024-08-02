package i.polymorphism.ex2;

public class Car {
	
	private String color;
	private String fuel;
	private int year;
	public Car(String color, String fuel, int year) {
		super();
		this.color = color;
		this.fuel = fuel;
		this.year = year;
	}
	public Car() {
		super();
	}
	public String getColor() {
		return color;
	}
	public String getFuel() {
		return fuel;
	}
	public int getYear() {
		return year;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return year + " " + fuel + " " + color;
	}
	
	public void drive() {
		System.out.println("부릉부릉~");
	}
	
}
