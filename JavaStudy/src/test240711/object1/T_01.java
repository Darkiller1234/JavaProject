package test240711.object1;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num>9 || num<2) {
				System.out.println("다시 입력하세요");
				continue;
			}
			else {
				for (int i = 2; i<=num;i++) {
					if(i%2==0) {
						for (int j = 1;j<10;j++) {
							System.out.println(i + " * " + j + " = " + i*j);
						}
					}
				}
				break;
			}
		}
		
		
		sc.close();
	}
}
