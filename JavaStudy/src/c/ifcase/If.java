package c.ifcase;

public class If {
	public static void main(String[] args) {
		if (0>1) {
			System.out.println("해가 서쪽에서 떴다.");
		}
		else {
			System.out.println("해가 동쪽에서 떴다.");
		}
		int x = 0;
		switch(x) {
		case 0:
			System.out.println("끼얏호우");
			break;
		case 1:
			break;
		default:
			System.out.println(x);
			break;
		}
	}
}
