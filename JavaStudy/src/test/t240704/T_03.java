package test.t240704;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		/*
		 * 두개의 값을 입력받아 그 사이 숫자 출력
		 * 1 미만 숫자 입력돼면 1 이상 숫자 입력 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		if(num1<1||num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			for (int i = num1>num2?num2:num1;i<=(num1>num2?num1:num2);i++) {
				System.out.print(i + " ");
			}
		}
		
		
		
		sc.close();
	}
}
