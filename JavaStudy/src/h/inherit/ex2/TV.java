package h.inherit.ex2;

public class TV extends Product{
	private int inch;

	public TV(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
	
	
	public TV() {
		super();
	}


	@Override
	public String information() {
		return super.information() + " 인치: " + this.inch;
	}
}
