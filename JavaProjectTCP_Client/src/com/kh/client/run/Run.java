package com.kh.client.run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		//"192.168.30.192"
		System.out.println("\"192.168.30.192\"");
		Scanner sc = new Scanner(System.in);
		new Running(sc.nextLine()).Excute();
		sc.close();
	}
}