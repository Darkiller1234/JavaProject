package h.inherit.ex1;

public class Run {
	public static void main(String[] args) {
//		Man man1 = new Man("윤대한");
//		man1.tellYourName();
		
		BusinessMan man2 = new BusinessMan("윤대한", "KH", "학생");
		man2.tellYourInfo();
	}
}
