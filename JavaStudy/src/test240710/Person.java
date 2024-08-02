package test240710;

public class Person {
	private String name;
	private int age;
	
	//모든 필드 데이터를 전달받은 값으로 초기화하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name : " + this.name + "\nage : " + this.age);
	}

	//name값만을 전달받아 초기화하는 생성자
	public Person(String name) {
		this(name, 1); // this()는 본인 생성자 호출, 생성자의 가장 첫번쨰줄에 작성해야 한다.
	}

	//값을 전달받지 않고 초기화하는 생성자
	public Person() {
		this("이름없음", 1);
	}
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
