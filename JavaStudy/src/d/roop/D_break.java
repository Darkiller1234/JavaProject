package d.roop;

import java.util.Scanner;

public class D_break {
	/*
	 * break;	: 반복문, switch문 안에서 사용되는 분기문
	 * 			  break;가 실행되는 순간 현재 속해있는 가장 가까운 반복문 또는 switch문을
	 * 			  강제로 탈출함
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		//랜덤값(1~100) 발생시키고 그 랜덤값을 출력(이 과정을 계속 반복)
		while(true) {
			num = (int)(Math.random() * 100) + 1;
			if(num%3 == 0) {
				break;
			}
		}
		System.out.println(num);
		
		
		//사용자에게 문자열을 입력받아 해당 문자열의 길이를 출력(반복)
		// 단, 사용자가 입력한 문자열이 exit일 경우 반복문을 탈출
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = new String(sc.nextLine());
			
			if(str.equals("exit"))
				break;
			
			System.out.println("문자열 길이 : " + str.length());
		}
		
		
		
		
		sc.close();
	}
}
