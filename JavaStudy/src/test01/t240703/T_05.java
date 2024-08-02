package test01.t240703;

import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력
		
		//ex)
		//정수를 하나 입력하세요 : 
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		System.out.print("1");
		sum++;
		if(num >= 1) {
			for (int i = 2; i <= num; i++) {
				System.out.print(" + " + i);
				sum += i;
			}
		}
		else {
			for (int i = 0; i >= num; i--) {
				System.out.print(" + " + i);
				sum += i;
			}
		}
		
		System.out.print(" = " + sum);
		
		
		
		
		
		sc.close();
	}
}
