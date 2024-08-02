package test.t240704;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		/*
		 * 입력받은 숫자부터 9단까지 구구단 출력
		 * 단, 9가 초과되는 숫자면 9 이하의 숫자만 입력해주세요 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if(num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			sc.close();
			return;
		}
		
		for (int i = num; i < 10; i++) {
			System.out.println("===== " + i + "단 =====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
		}
		
		
		sc.close();
	}
}
