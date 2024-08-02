package c.ifcase;

import java.util.Scanner;

public class B_case2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//과일을 구매하는 프로그램 작성
		//구매하고자 하는 과일 일볅
		//그에맞는 가격이 출력되는 프로그램 작성
		//사과(2000), 바나나(3000), 딸기(5000)
		
		
//		String fru = new String();
//		int money = 0;
//		
//		System.out.print("구매하고자 하는 과일(사과, 바나나, 딸기) 입력 : ");
//		
//		fru = sc.next();
//		
//		
//		switch(fru) {
//		case "사과":
//			money = 2000;
//			break;
//		case "바나나":
//			money = 3000;
//			break;
//		case "딸기":
//			money = 5000;
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//			sc.close();
//			return;
//		}
//		
//		if(fru.equals("사과")) {
//			money = 2000;
//		}
//		else if(fru.equals("바나나")) {
//			money = 3000;
//		}
//		else if(fru.equals("딸기")) {
//			money = 5000;
//		}
//		else {
//			System.out.println("잘못입력하셨습니다.");
//			sc.close();
//			return;
//		}
//			
//		
//		System.out.println(fru + "의 가격은 " + money + "원 입니다.");
		
		
		
		
		//월을 입력받아 해당 월에 말일이 며칠까지 있는지를 출력하는 프로그램
		
		//월을 입력하세요 : xx
		// xx월은 xx일까지 입니다.
		
		// 1, 3, 5, 7, 8, 10, 12 => 31
		// 4, 6, 9, 11 => 30
		//2 => 28
		int month, day;
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		sc.nextLine();
		
		switch(month) {
		case 2:
			day = 28;
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			day = 31;
		    break;
		case 4, 6, 9 ,11:
			day = 30;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			sc.close();
			return;
		}
		
		System.out.println(month + "월은 " + day + "일까지 입니다.");
		
		if (month == 2) {
			day = 28;
		}
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day = 31;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}
		
		
		System.out.println(month + "월은 " + day + "일까지 입니다.");
		
		sc.close();
	}
}
