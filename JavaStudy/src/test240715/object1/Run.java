package test240715.object1;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		//정수 num 1 2 3 입력받아 홀짝 출력
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("입력 : ");
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		sc.nextLine();
//		if(num1%2==0) {
//			System.out.print("짝 ");
//		}
//		else {
//			System.out.print("홀 ");
//		}
//		if(num2%2==0) {
//			System.out.print("짝 ");
//		}
//		else {
//			System.out.print("홀 ");
//		}
//		if(num3%2==0) {
//			System.out.print("짝 ");
//		}
//		else {
//			System.out.print("홀 ");
//		}
//		System.out.println();
//		
//		//정수 0~100 을 입력받아 0부터 입력받은 수까지 출력
//		System.out.print("입력 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		for(int i = 0; i<=num;i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		//번호를 입력한 횟수를 구하는 프로그램 작성
//		//번호 1~20 무작위로 10번 입력받음
//		// 입력받은 1~20까지의 수가 각각 몇번 입력되었는지를 출력
//		
//		int[] nArr = new int[20];
//		System.out.print("입력 : ");
//		for(int i = 0; i<10; i++) {
//			nArr[sc.nextInt()-1]++;
//		}
//		System.out.print("입력횟수 : ");
//		for(int i = 0; i<nArr.length; i++) {
//			System.out.print(nArr[i] + " ");
//		}
		
		
		// 학생성적관리 프로그램을 만들고자한다.
		// 학생클래스를 정의해보자. Student class는 name(String), classRoom(int), 
		// javaScore, sqlScore, practiceScore(double 값을 가짐
		//또한 toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를 반환하는 메소드
		//각 필드데이터의 getter/setter, 기본생성자, 모든필드데이터초기화 생성자
		// isPassed : 모든 점수가 50점 이상이면서 평균 60점 이상
		// reTest : 학생의 모든 점수를 랜덤(0~100)으로 다시 부여하는 메소드 반환없음
		
		// 학생 10명 생성, reTest실행 후 모든 학생의 정수 출력
		Student[] stArr = new Student[10];
		for(int i = 0; i< stArr.length; i++) {
			stArr[i] = new Student();
			System.out.print("이름 : ");
			stArr[i].setName(sc.nextLine());
			System.out.print("반 : ");
			stArr[i].setClassRoom(sc.nextInt());
			sc.nextLine();
		}
		for(int i = 0; i<stArr.length; i++) {
			stArr[i].reTest();
			System.out.printf("%5s %3d %5.2f %5.2f %5.2f\n", stArr[i].getName()
					, stArr[i].getClassRoom(), stArr[i].getJavaScore(), stArr[i].getSqlScore()
					, stArr[i].getPracticeScore());
		}
		for(Student std : stArr) {
			System.out.println(std.toString());
		}
		
		
		
		
		sc.close();
	}
}
