package a.basic;

import java.util.Scanner;

public class Practice_2 {
	/*
	 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하시오
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로) * 2
	 * 
	 * 가로 : (키보드입력
	 * 세로 : ``
	 * 
	 * 면적 : ~
	 * 둘레 : ~
	 * 소수점 2번째 자리까지만 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("면적 : %.2f",(float)width*height);
		System.out.printf("\n둘레 : %.2f", (float) (width + height) * 2);
		
		
		sc.close();
	}
}
