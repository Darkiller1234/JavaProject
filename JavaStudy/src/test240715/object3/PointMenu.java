package test240715.object3;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	
	private CircleController cc = new CircleController();
	
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				this.circleMenu();
				break;
			case 2:
				this.rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
		}
		
		
	}
	
	public void circleMenu() {
		while(true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				this.calcCircum();
				break;
			case 2:
				this.calcCircleArea();
				break;
			case 9:
				System.out.println("메뉴로 돌아갑니다.");
				System.out.println();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			return;
		}
	}
	
	public void rectangleMenu() {
		while(true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				this.calcPerimeter();
				break;
			case 2:
				this.calcRectArea();
				break;
			case 9:
				System.out.println("메뉴로 돌아갑니다.");
				System.out.println();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			return;
		}
	}
	
	public void calcCircum() {
		int x, y, radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		sc.nextLine();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		sc.nextLine();
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		int x, y, radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		sc.nextLine();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		sc.nextLine();
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		int x, y, width, height;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		sc.nextLine();
		System.out.print("높이 : ");
		height = sc.nextInt();
		sc.nextLine();
		System.out.print("너비 : ");
		width = sc.nextInt();
		sc.nextLine();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		int x, y, width, height;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		sc.nextLine();
		System.out.print("높이 : ");
		height = sc.nextInt();
		sc.nextLine();
		System.out.print("너비 : ");
		width = sc.nextInt();
		sc.nextLine();
		System.out.println(rc.calcArea(x, y, height, width));
	}
	
}
