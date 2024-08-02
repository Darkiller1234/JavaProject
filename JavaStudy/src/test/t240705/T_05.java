package test.t240705;

import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		/*
		 * 키, 몸무게를 ,double로 입력받아 BMI지수를 계산, 결과에 따라
		 * 저체중/정상체중/과체중/비만 출력
		 * BMI = 몸무게 / (키(m) * 키(m))
		 * BMI 18.5 미만 : 저체중 / 18.5 이상 23 미만 정상체중
		 * 23  이상 25 미만 과체중 / 25 이상 30 미만 비만
		 * 30 이상 고도 비만
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		if(bmi < 18.5) {
			System.out.println("저체중");
		}
		else if(bmi < 23) {
			System.out.println("정상체중");
		}
		else if(bmi < 25) {
			System.out.println("과체중");
		}
		else if(bmi < 30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도비만");
		}
		
		
		
		
		sc.close();
	}
}
