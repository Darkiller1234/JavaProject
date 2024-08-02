package f.object.ex4;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// choi 객체 생성 최지원, 15살, 영어 : 60, 수학 : 70, 국어 : 80
		// kim 객체 생성 김도한, 18살, 영어 : 95, 수학 : 50, 국어 : 70
//		Student choi = new Student("최지원", 15, 60, 70, 80);
//		Student kim = new Student("김도한", 18, 95, 50, 70);
//		
//		//choi의 모든 과목의 평균을 출력
//		System.out.println(choi.getName() + "님의 평균 : " + choi.getAvg());
//		System.out.println(kim.getName() + "님의 평균 : " + kim.getAvg());
		
		//사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
		//평균을 구하고 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		Student std = new Student(name,age,eng,math,kor);
		std.printAvg();
		
		sc.close();
	}
}
