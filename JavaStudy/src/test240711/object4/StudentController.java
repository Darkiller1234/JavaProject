package test240711.object4;

public class StudentController {
	private Student[] sArr = new Student[5];
	public final int CUT_LINE = 60;
	public StudentController() {
		super();
		this.sArr[0] = new Student("김길동", "자바", 100);
		this.sArr[1] = new Student("박길동", "디비", 50);
		this.sArr[2] = new Student("이길동", "화면", 85);
		this.sArr[3] = new Student("정길동", "서버", 60);
		this.sArr[4] = new Student("홍길동", "자바", 20);
		
	}

	public Student[] printStudent() {
		return this.sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < this.sArr.length;i++) {
			sum+=sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] dbArr = new double[2];
		dbArr[0] = this.sumScore();
		dbArr[1] = dbArr[0] / sArr.length;
		return dbArr;
	}
}
