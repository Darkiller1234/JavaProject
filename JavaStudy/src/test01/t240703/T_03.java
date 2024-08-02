package test01.t240703;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수, 수학점수, 영어점수를 입력하시오 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1+num2+num3;
		if(num1>=40 && num2 >= 40 && num3 >= 40 && (float)sum/3>=60) {
			System.out.println("국어 : " + num1);
			System.out.println("수학 : " + num2);
			System.out.println("영어 : " + num3);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n", (float)sum/3);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
}
