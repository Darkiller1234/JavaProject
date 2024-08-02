package test240716.object4;

public class Employee extends Person{
	private int salary;
	private String dept;
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " + this.salary + ", " + this.dept;
	}
	
	
	
	
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
