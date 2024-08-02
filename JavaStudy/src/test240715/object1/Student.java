package test240715.object1;

public class Student {
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	public Student() {
		
	}

	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}

	public String getName() {
		return name;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public double getJavaScore() {
		return javaScore;
	}

	public double getSqlScore() {
		return sqlScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	
	public String toString() {
		return this.classRoom + "반 " + this.name + "학생 " + this.javaScore + "점 " + 
	this.sqlScore + "점 " + this.practiceScore + "점";
	}
	
	public boolean isPassed() {
		if(this.javaScore>=50&&this.sqlScore>=50&&this.practiceScore>=50&&(this.javaScore+this.practiceScore+this.sqlScore)/3>=60) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void reTest() {
		this.javaScore = (Math.random() * 101);
		this.sqlScore = (Math.random() * 101);
		this.practiceScore = (Math.random() * 101);
	}
}
