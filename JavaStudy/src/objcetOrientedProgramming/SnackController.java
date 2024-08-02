package objcetOrientedProgramming;

public class SnackController {
	private Snack s = new Snack();

	public SnackController() {
		super();
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		this.s.setKind(kind);
		this.s.setName(name);
		this.s.setFlavor(flavor);
		this.s.setNumOf(numOf);
		this.s.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		return s.information();
	}
	
	
}
