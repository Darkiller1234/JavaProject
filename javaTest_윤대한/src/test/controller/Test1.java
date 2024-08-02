package test.controller;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		if(num>100 || num<1) {
			System.out.println("1~100 사이의 값만 입력하시오.");
		}
		else {
			System.out.println(num%2==0?"2의 배수입니다.":"2의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
