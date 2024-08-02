package test240717.object1;

import java.util.Scanner;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		lc.insertMember(new Member(name, age, gender, 0));
		
		while(true) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int index = sc.nextInt();
			sc.nextLine();
			switch(index) {
			case 1:
				System.out.println(lc.myInfo().toString());
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length && bList[i] != null; i++) {
			System.out.println(i + "번도서 : " + bList[i].toString());
		}
	}
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String str = sc.nextLine();
		Book[] searchList = lc.searchBook(str);
		for(int i = 0; i < searchList.length && searchList[i] != null; i++) {
			System.out.println(searchList[i].toString());
		}
	}
	public void rentBook() {
		this.selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(lc.rentBook(num)) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
			break;
		}
		
	}
}
