package test.t240705;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 주민번호를 입력받아 남자인지 여자인지 구분
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String str = new String(sc.nextLine());
		if(str.charAt(7) == '1' || str.charAt(7) == '3') {
			System.out.println("남자입니다.");
		}
		else if(str.charAt(7) == '2' || str.charAt(7) == '4') {
			System.out.println("여자입니다.");
		}
		else {
			System.out.println("???");
		}
		
		
		
		
		sc.close();
	}
}
