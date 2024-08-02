package test01.t240703;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
