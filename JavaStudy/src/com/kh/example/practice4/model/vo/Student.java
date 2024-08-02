package com.kh.example.practice4.model.vo;

public class Student {
	private int grade = 0;
	private int classroom = 0;
	private String name = "";
	private double height = 0;
	private char gender = '중';
	
	
	
	public Student() {
		
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public int getClassroom() {
		return classroom;
	}



	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public void information() {
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.grade);
		System.out.println("반 : " + this.classroom);
		System.out.println("성별 : " + this.gender);
		System.out.println("키 : " + this.height);
	}
}
