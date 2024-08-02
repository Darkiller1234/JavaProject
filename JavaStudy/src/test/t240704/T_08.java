package test.t240704;

import java.util.Scanner;

public class T_08 {
	public static void main(String[] args) {
		/*
		 * "일" ~ "토" 까지 초기화된 문자열 배열
		 * 0 ~ 6 숫자 입력받아 요일 출력
		 * 범위 아닌 숫자 입력시 "잘못 입력하셨습니다"
		 */
		Scanner sc = new Scanner(System.in);
		char[] chArr = {
				'일', '월', '화', '수', '목', '금', '토'
		};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>6 || num<0) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else {
			System.out.println(chArr[num]+"요일");
		}
		sc.close();
	}
}
