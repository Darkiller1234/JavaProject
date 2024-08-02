package test240716.object4;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	public Student() {
		super();
	}
	

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " + this.grade + ", " + this.major;
	}
	
	
	
	
	
	
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
