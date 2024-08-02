package test240716.object4;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
	public int[] personCount() {
		int num1 = 0, num2 = 0;
		for(int i = 0; i<s.length&&s[i] != null; i++) {
			num1++;
		}
		for(int i = 0; i<e.length&&e[i] != null; i++) {
			num2++;
		}
		int[] i = new int[]{num1, num2};
		return i;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		s[this.personCount()[0]] = new Student(name,age,height,weight,grade,major);
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		e[this.personCount()[1]] = new Employee(name,age,height,weight,salary,dept);
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
