package test01;

import java.util.Scanner;

public class PlayingGround {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("양의정수 입력 : ");
//		
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		for(int i = 1; i<=num;i++) {
//			for (int j = 1; j <= i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		System.out.print("양의정수 입력 : ");
//
//		int num = sc.nextInt();
//		sc.nextLine();
//
//		for (int i = 1; i <= num; i++) {
//			for (int k = 0; k <= num - i; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int king, queen, rook, bishop, knight, pawn;
		System.out.print("킹 퀸 룩 비숍 나이트 폰 : ");
		king = sc.nextInt();
		queen = sc.nextInt();
		rook = sc.nextInt();
		bishop = sc.nextInt();
		knight = sc.nextInt();
		pawn = sc.nextInt();
		
		sc.nextLine();
		
		System.out.printf("%d %d %d %d %d %d",1-king, 1-queen, 2-rook, 2-bishop, 2-knight, 8-pawn);
		

		sc.close();
	}
}
