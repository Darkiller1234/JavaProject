package test240716.object1;

public class CircleController {
	private Circle c = new Circle();
	private final double PI = 3.14159265358979323846264338;
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		return "면적 : " + c.getX() + ", " + c.getY() + ", " + c.getRadius() + " / " + (PI*radius*radius);
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		return "둘레 : " + c.getX() + ", " + c.getY() + ", " + c.getRadius() + " / " + (PI*radius*2);
	}
}
