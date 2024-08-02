package test.t240705;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		/*
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균 출력
		 * 총점과 평균은 정수형
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		float num1 = sc.nextFloat();
		
		System.out.print("영어 : ");
		float num2 = sc.nextFloat();
		
		System.out.print("수어 : ");
		float num3 = sc.nextFloat();
		
		System.out.println("총점 : " + (int)(num1+num2+num3));
		System.out.println("평균 : " + (int)((num1+num2+num3)/3));
		
		sc.close();
	}
}
