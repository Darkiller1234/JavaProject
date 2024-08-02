package test.t240704;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 등급 입력받아
		 * 각 등극비 행할 수 있는 권한 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		String str = new String(sc.nextLine());
		switch(str) {
		case "관리자":
			System.out.print("회원관리, ");
			System.out.print("게시글관리, ");
		case "회원":
			System.out.print("게시글작성, ");
			System.out.print("댓글작성, ");
		case "비회원":
			System.out.print("게시글조회");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println();
		
		
		if(str.equals("관리자")) {
			System.out.print("회원관리, ");
			System.out.print("게시글관리, ");
		}
		if(str.equals("관리자") || str.equals("회원")) {
			System.out.print("게시글작성, ");
			System.out.print("댓글작성, ");
		}
		if(str.equals("관리자") || str.equals("회원") || str.equals("비회원")) {
			System.out.print("게시글조회");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		sc.close();
	}
}
