package test240711.object2;

public class Run {
	public static void main(String[] args) {
		TV myTV = new TV("삼성", 2020, 65, 100000);
		myTV.show();
		System.out.println();
		TV myTV2 = new TV("LG", 2024, 85, 500000);
		myTV2.show();
		System.out.println();
		
		Human one = new Human("윤대한", 1000000);
		one.buy(myTV);
	}

	
}
