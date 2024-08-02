package test240709.object1;

public class Run {
	public static void main(String[] args) {
		Member yoon = new Member();
		yoon.changeName("윤대한");
		yoon.printName();
		
		//아이디, 비번, 이름을 초기화하는 생성자를 통해
		//객체를 하나 생성하고 printName()을 통해 이름을 출력해라
		Member yoon1 = new Member("Darkiller", "Darkiller123", "윤대한");
		yoon1.changeName("윤대한");
		yoon1.printName();
	}
}
