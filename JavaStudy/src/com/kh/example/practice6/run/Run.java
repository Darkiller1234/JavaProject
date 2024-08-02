package com.kh.example.practice6.run;

import java.util.Scanner;

import com.kh.example.practice6.model.vo.*;

public class Run {
	static int num() {
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(num());
		Book bookA = new Book();
		System.out.print("2번책 제목: ");
		String bTitle = new String(sc.nextLine());
		System.out.print("2번책 출판사: ");
		String bPublisher = new String(sc.nextLine());
		System.out.print("2번책 작가: ");
		String bAuthor = new String(sc.nextLine());
		Book bookB = new Book(bTitle, bPublisher, bAuthor);
		
		System.out.print("3번책 제목: ");
		String cTitle = new String(sc.nextLine());
		System.out.print("3번책 출판사: ");
		String cPublisher = new String(sc.nextLine());
		System.out.print("3번책 작가: ");
		String cAuthor = new String(sc.nextLine());
		System.out.print("3번책 가격: ");
		int cPrice = sc.nextInt();
		sc.nextLine();
		System.out.print("3번책 할인율: ");
		double cDiscountRate = sc.nextDouble();
		sc.nextLine();
		Book bookC = new Book(cTitle, cPublisher, cAuthor, cPrice, cDiscountRate);
		
		
		bookA.inform();
		System.out.println();
		bookB.inform();
		System.out.println();
		bookC.inform();
		
		
		sc.close();
	}
}
