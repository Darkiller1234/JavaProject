package test01.t240703;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				continue;
			}
			else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		
		
		
//		while(true) {
//			System.out.print("1 이상의 숫자를 입력하세요 : ");
//			int num = sc.nextInt();
//			switch(num) {
//			case 0:
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//				continue;
//			default:
//				switch(Integer.toBinaryString(num).length()) {
//				case 32:
//					System.out.println("1 이상의 숫자를 입력해주세요.");
//					continue;
//				default:
//					for (int i = 1; i <= num; i++) {
//						System.out.print(i + " ");
//					}
//				}
//			}
//			break;
//		}
		
		
		
		
		
		
		sc.close();
	}
}
