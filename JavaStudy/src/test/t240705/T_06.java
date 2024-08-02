package test.t240705;

import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수 입력 pass or fail
		 * 비율은 중간 20, 기발 30, 과제 30, 출석 20
		 * 출석 비율은 출석 회수의 총 강의 회수 20회 중 출석한 날만 따진 값으로 계산
		 * 70점 이상 pass, 70점 미만 or 30%이상 결석 fail
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble() * 0.2;
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble() * 0.3;
		System.out.print("과제 점수 : ");
		double assign = sc.nextDouble() * 0.3;
		System.out.print("출석 회수 : ");
		double check = sc.nextDouble();
		System.out.println("==================== 결과 ====================");
		System.out.println("중간 고사 점수(20) : " + mid);
		System.out.println("기말 고사 점수(30) : " + fin);
		System.out.println("과제 점수    (30) : " + assign);
		System.out.println("출석 점수    (20) : " + check);
		System.out.println("총점 : " + (mid + fin + assign + check));
		if(mid + fin + assign + check < 70 ) {
			System.out.print("Fail [점수 미달]");
			if(check*5 < 70) {
				System.out.println(" [출석 미달]");
			}
		}
		else if(check*5 < 70) {
			System.out.println("Fail [출석 미달]");
		}
		else {
			System.out.println("Pass");
		}
		
		
		
		sc.close();
	}
}
