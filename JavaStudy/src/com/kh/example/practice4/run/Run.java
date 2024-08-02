package com.kh.example.practice4.run;

import java.util.Scanner;

import com.kh.example.practice4.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.print("학생이름 : ");
		std.setName(sc.nextLine());
		
		System.out.print("학년 : ");
		std.setGrade(sc.nextInt());
		sc.nextLine();
		
		System.out.print("반 : ");
		std.setClassroom(sc.nextInt());
		sc.nextLine();
		
		System.out.print("성별(남/여) : ");
		std.setGender(sc.nextLine().charAt(0));

		System.out.println("키 : ");
		std.setHeight(sc.nextDouble());
		sc.nextLine();
		
		
		
		std.information();
		
		sc.close();
	}
}
