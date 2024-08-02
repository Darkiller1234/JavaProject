package test.t240705;

import java.util.Scanner;

public class T_09 {
	public static void main(String[] args) {
		/*
		 * 정수 받아 양수일때만 1부터 홀수/짝수 나눠서 홀수면 박, 짝수면 수 출력
		 * 
		 * 양수가 아니면 양수가 아닙니다 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if(num<1) {
			System.out.println("양수가 아닙니다.");
		}
		else {
			for(int i = 1;i <= num; i++) {
				System.out.print(i%2==0?"수":"박");
			}
		}
		
		
		
		sc.close();
		
	}
}
