package test240708;

import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1>0 && num1 < 10 && num2>0 && num2 < 10) {
			if (num1 * num2 < 10) {
				System.out.println("한자리 수 입니다.");
			} else {
				System.out.println("두자리 수 입니다.");
			}
		}

		sc.close();
	}
}
