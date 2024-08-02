package test240716.object3;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	public User() {
		super();
	}
	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	public String toString() {
		return this.id + " " + this.password + " " + this.name + " " + this.age + " " + this.gender + " " + this.phone;
	}
	
	public boolean equals(Object obj) {
		User us = (User) obj;
		return us.getId().equals(this.id)&& us.getPassword().equals(this.password) && 
				us.getName().equals(this.name)&& us.getAge() == this.age &&
				us.getGender() == this.gender && us.getPhone().equals(this.phone);
	}
	
	protected Object clone() {
		return new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
	}
	
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
