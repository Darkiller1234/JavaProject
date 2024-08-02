package test.t240705;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		/*
		 * A,B,C 사원 연봉 입력바디
		 * 연봉과 인센티브 포함한 연봉 계산
		 * 인센포함 급여가 3000만원 이상이면 3000이상 미만이면 3000 미만
		 * (A 0.4, B x, C 0.15)
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		char[] chArr = new char[] {
			'A', 'B', 'C'	
		};
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%c사원의 연봉 : ", chArr[i]);
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%c사원 연봉/연봉+a : %d/%.6s\n", chArr[i], arr[i], chArr[i]=='A'?arr[i]*1.4:(chArr[i]=='B'?arr[i]:arr[i]*1.15));
			if((chArr[i]=='A'?arr[i]*1.4:chArr[i]=='B'?arr[i]:arr[i]*1.15) >= 3000) {
				System.out.println("3000 이상");
			}
			else {
				System.out.println("3000 미만");
			}
		}
		
		
		sc.close();
	}
}
