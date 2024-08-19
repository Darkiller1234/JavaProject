package com.kh.model.vo;

import java.sql.Date;

/*
 * VO(Value Object)
 * 한명의 회원(db테이블 한 행의 데이터)에 대한 데이터를 기록할 수 있는 저장용 객체
 * 
 */
public class Member {
	//필드는 기본적으로 db 컬럼명과 유사하게 작업
	private int userNO;
	private String userID;
	private String userPWD;
	private String userName;
	private String gender;
	private int age;
	private String email;
	private String phone;
	private String address;
	private String hobby;
	private Date enrollDate; //java.sql.Date
	public Member() {
		super();
	}
	public Member(int userNO, String userID, String userPWD, String userName, String gender, int age, String email,
			String phone, String address, String hobby, Date enrollDate) {
		super();
		this.userNO = userNO;
		this.userID = userID;
		this.userPWD = userPWD;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.enrollDate = enrollDate;
	}
	
	
	
	public Member(String userID, String userPWD, String userName, String gender, int age, String email, String phone,
			String address, String hobby) {
		super();
		this.userID = userID;
		this.userPWD = userPWD;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
	}
	public int getUserNO() {
		return userNO;
	}
	public String getUserID() {
		return userID;
	}
	public String getUserPWD() {
		return userPWD;
	}
	public String getUserName() {
		return userName;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getHobby() {
		return hobby;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setUserNO(int userNO) {
		this.userNO = userNO;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	@Override
	public String toString() {
		return userNO + ", " + userID + ", " + userPWD + ", " + userName
				+ ", " + gender + ", " + age + ", " + email + ", " + phone + ", "
				+ address + ", " + hobby + ", " + enrollDate;
	}
	

}
