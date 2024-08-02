package test240716.object4;

import java.util.Scanner;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("학생은 최대 " + pc.printStudent().length + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 " + pc.printEmployee().length + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println();
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int index = sc.nextInt();
			sc.nextLine();
			switch(index) {
			case 1:
				this.studentMenu();
				break;
			case 2:
				this.employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void studentMenu() {
		while(true) {
			System.out.println();
			

			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[0]==3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 "
						+ "더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			int index = sc.nextInt();
			sc.nextLine();
			switch(index) {
			case 1:
				if(pc.personCount()[0]==3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				this.insertStudent();
				break;
			case 2:
				this.printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void employeeMenu() {
		while(true) {
			System.out.println();
			
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[1]==10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 "
						+ "더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			int index = sc.nextInt();
			sc.nextLine();
			switch(index) {
			case 1:
				if(pc.personCount()[1]==10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				this.insertEmployee();
				break;
			case 2:
				this.printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertStudent() {
		while(true) {
			System.out.println();
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			sc.nextLine();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			pc.insertStudent(name, age, height, weight, grade, major);
			if(pc.personCount()[0] != 3) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.nextLine().charAt(0);
				switch(ch) {
				case 'n':
				case 'N':
					return;
				default:
					continue;
				}
			}
			else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고"
						+ " 학생 메뉴로 돌아갑니다.");
				return;
			}
		}
	}
	public void printStudent() {
		System.out.println();
		for(int i = 0; i < pc.personCount()[0]; i++) {
			System.out.println(pc.printStudent()[i].toString());
		}
	}
	public void insertEmployee() {
		while(true) {
			System.out.println();
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			sc.nextLine();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			pc.insertEmployee(name, age, height, weight, salary, dept);
			if(pc.personCount()[1] != 10) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.nextLine().charAt(0);
				switch(ch) {
				case 'n':
				case 'N':
					return;
				default:
					continue;
				}
			}
			else {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고"
						+ " 사원 메뉴로 돌아갑니다.");
				return;
			}
		}
	}
	public void printEmployee() {
		System.out.println();
		for(int i = 0; i < pc.personCount()[1]; i++) {
			System.out.println(pc.printEmployee()[i].toString());
		}
	}
}
