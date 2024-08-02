package test.t240704;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		/*
		 * 아이디 비밀번호 정해두고 로그인기능 작성
		 */
		final String ID = new String("myId");
		final String PWD = new String("myPassword12");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("아이디 : ");
		String checkID = new String(sc.nextLine());
		System.out.print("비밀번호 : ");
		String checkPWD = new String(sc.nextLine());
		
		if(checkID.equals(ID)) {
			if(checkPWD.equals(PWD)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
			if(!checkPWD.equals(PWD)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		sc.close();
	}
}
