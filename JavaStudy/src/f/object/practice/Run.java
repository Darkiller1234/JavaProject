package f.object.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(yesdd(sc));
		bookStart();
//		sc.close();
	}
	public static void bookStart() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> Books = new ArrayList<>();
		int booksIndex = 0;
		while (true) {
			System.out.println("메뉴를 선택하시오.\n1. 책 등록\n2. 책 수정\n3. 책 일람 및 검색\n0. 종료");
			int sys = sc.nextInt();
			sc.nextLine();
			switch(sys) {
			case 0:
				sc.close();
				return;
			case 1:
				Books.add(new Book());
				String str1, str2, str3, str4, str5; int num1, num2, num3;
				
				System.out.print("책 제목을 입력하세요 : ");
				str1 = sc.nextLine();
				System.out.print("저자를 입력하세요 : ");
				str2 = sc.nextLine();
				System.out.print("장르를 입력하세요 : ");
				str3 = sc.nextLine();
				System.out.print("출판사를 입력하세요 : ");
				str4 = sc.nextLine();
				System.out.print("가격을 입력하세요(정수) : ");
				num1 = sc.nextInt();
				sc.nextLine();
				System.out.print("발행일을 입력하세요 : ");
				str5 = sc.nextLine();
				System.out.print("재고를 입력하세요(정수) : ");
				num2 = sc.nextInt();
				sc.nextLine();
				System.out.print("쪽수를 입력하세요 : ");
				num3 = sc.nextInt();
				sc.nextLine();
				((Book)Books.get(booksIndex)).firstSetting(str1, str2, str3, str4, str5, num1, num2, num3);
				((Book)Books.get(booksIndex)).info();
				System.out.println("정상적으로 등록되었습니다.");
				System.out.println("식별번호는 " + booksIndex++ + " 입니다.");
				break;
			case 2:
				System.out.print("책 식별번호를 입력하세요 : ");
				int bookNum = sc.nextInt();
				sc.nextLine();
				((Book) Books.get(bookNum)).info();
				System.out.println();
				System.out.println("수정할 사항을 선택하세요.\n1. 제목\n2. 저자\n3. 장르\n4. 출판사\n5. 가격\n6. 발행\n7. 재고\n8. 쪽수");
				int index = sc.nextInt();
				sc.nextLine();
				switch(index) {
				case 1:
					System.out.println("현재 제목은 " + ((Book) Books.get(bookNum)).name + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						System.out.println("제목을 입력하세요.");
						((Book) Books.get(bookNum)).name = new String(sc.nextLine());
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					}
				case 2:
					System.out.println("현재 저자는 " + ((Book) Books.get(bookNum)).writer + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						System.out.println("저자를 입력하세요.");
						((Book) Books.get(bookNum)).writer = new String(sc.nextLine());
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					
					}
				case 3:
					System.out.println("현재 장르는 " + ((Book) Books.get(bookNum)).category + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						System.out.println("장르를 입력하세요.");
						((Book) Books.get(bookNum)).category = new String(sc.nextLine());
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					}
				case 4:
					System.out.println("현재 출판사 " + ((Book) Books.get(bookNum)).publisher + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						System.out.println("출판사를 입력하세요.");
						((Book) Books.get(bookNum)).publisher = new String(sc.nextLine());
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					}
				case 5:
					System.out.println("현재 가격은 " + ((Book) Books.get(bookNum)).price + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						System.out.println("가격을 입력하세요.");
						((Book) Books.get(bookNum)).price = sc.nextInt();
						sc.nextLine();
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					}
				case 6:
					System.out.println("현재 발행일은 " + ((Book) Books.get(bookNum)).pubDate + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						System.out.println("발행일을 입력하세요.");
						((Book) Books.get(bookNum)).pubDate = new String(sc.nextLine());
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					}
				case 7:
					System.out.println("현재 재고는 " + ((Book) Books.get(bookNum)).stock + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						System.out.println("재고를 입력하세요.");
						((Book) Books.get(bookNum)).stock = sc.nextInt();
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					}
				case 8:
					System.out.println("현재 쪽수는 " + ((Book) Books.get(bookNum)).pages + "입니다.");
					System.out.println("수정하시겠습니까?(y/n)");
					switch(sc.next()) {
					case "y":
						sc.nextLine();
						System.out.println("쪽수를 입력하세요.");
						((Book) Books.get(bookNum)).pages = sc.nextInt();
						System.out.print("수정되었습니다 ...");
						break;
					case "n":
						sc.nextLine();
						System.out.print("메뉴로 돌아갑니다 ...");
						break;
					}
				}
				sc.nextLine();
				break;
			case 3:
				System.out.println("식별번호로 검색하시겠습니까? (y/n)");
				switch(sc.next()) {
				case"y":
					sc.nextLine();
					System.out.print("식별번호를 입력하세요 : ");
					((Book) Books.get(sc.nextInt())).info();
					sc.nextLine();
					System.out.print("...");
					sc.nextLine();
					break;
				case"n":
					sc.nextLine();
					System.out.println("책 목록을 호출합니다.");
					for(int i = 0;i<booksIndex;i++) {
						System.out.println("제목 : " + ((Book) Books.get(i)).name);
						System.out.println("식별번호 : " + i);
					}
					System.out.print("...");
					sc.nextLine();
					break;
				}
				break;
			}
			
			System.out.println("=================================");
		}
	}
	public static String yesdd(Scanner sc) {
		String str = sc.nextLine();
		return str;
	}

}
