package o.collection.set;

public class Student {
	private String name;
	private int age;
	private int score;
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
//		return Objects.hash(name, age, score);
		return (name + age + score).hashCode();
	}
	@Override
	public boolean equals(Object obj) { // 현재겍체와 전달받은 객체의 각 필드값들이 모두 일치하면 true/ 하나라도 일치하지 않는다면 false반환
		// this(현재겍체 	<-> obj(전달받은객체
//		return super.equals(obj);
		Student s = (Student)obj;
		if(this.name.equals(s.getName()) && this.age == s.getAge() && this.score == s.getScore()){
			return true;
		}
		return false;
	}
	
}
