package test240726.object1;

import java.util.Scanner;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);

	private TokenController tc = new TokenController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 지정 문자열");
			System.out.println("9. 지정 문자열");
			System.out.print("메뉴 번호 : ");
			int index = sc.nextInt();
			sc.nextLine();
			switch (index) {
			case 1:
				this.tokenMenu();
				break;
			case 2:
				this.inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println(str);
		System.out.println(str.length());
		String str2 = tc.afterToken(str);
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str2.toUpperCase());
	}

	public void inputMenu() {
		System.out.println("문자열을 입력하세요 : ");
		String str = new String(sc.nextLine());
		
		System.out.println(tc.firstCap(str));
		
		System.out.println("찾을 문자 하나 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(tc.findChar(str, ch));
	}
}
