package i.polymorphism.ex2;

public class Sonata extends Car {

	public Sonata() {
		super();
	}

	public Sonata(String color, String fuel, int year) {
		super(color, fuel, year);
	}

	public void drive() {
		System.out.println("부웅~부웅~");
	}
	
	public void moveSonata() {
		System.out.println("소나타 이동");
	}
}
