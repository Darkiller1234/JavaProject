package test240715.object3;

public class RectangleController {
	private Rectangle r = new Rectangle();

	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x,y,height,width);
		return "면적 : " + x + ", " + y + ", " +  r.getHeight() + ", " + r.getWidth() + " / " + (r.getHeight() * r.getWidth());
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x,y,height,width);
		return "둘레 : " + x + ", " + y + ", " +  r.getHeight() + ", " + r.getWidth() + " / " + ((r.getHeight() + r.getWidth())*2);
	}
}