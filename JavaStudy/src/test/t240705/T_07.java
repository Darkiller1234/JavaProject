package test.t240705;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아 그 사이 숫자 모두 출력
		 * 1 미만이 입력되면 1 이상의 숫자 입력해주세요
		 * 다시 사용자가 값을입력하도록 하세요
		 */
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			if(num1 >= 1 && num2 >= 1) {
				break;
			}
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for (int i = (num1>num2?num2:num1); i <= (num1>num2?num1:num2);i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
