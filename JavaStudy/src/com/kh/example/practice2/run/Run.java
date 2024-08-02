package com.kh.example.practice2.run;

import java.util.Scanner;

import com.kh.example.practice2.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product a = new Product();
		System.out.print("제품이름 : ");
		a.setBrand(sc.nextLine());
		System.out.print("제품가격 : ");
		a.setPrice(sc.nextInt());
		sc.nextLine();
		System.out.print("제품브랜드 : ");
		a.setpName(sc.nextLine());
		
		a.information();
		
		
		String str, str2; int num;
		System.out.print("제품이름 : ");
		str = sc.nextLine();
		System.out.print("제품가격 : ");
		num = sc.nextInt();
		sc.nextLine();
		System.out.print("제품브랜드 : ");
		str2 = sc.nextLine();
		
		Product b = new Product(str, num, str2);
		b.information();
		sc.close();
	}
}
