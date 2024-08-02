package test240711.object3;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] arr = new  Book[10];
		
//		arr[0] = new Book("안녕", "소설", "김철수", 50);
//		System.out.println(arr[0].toString());
		
		int menu = 0;
//		Book b1=null , b2=null, b3=null;
		while(menu != 9) {
			System.out.println("===========도서관리 프로그램==========");
			String title, genre, author;
			int num;
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록 출력");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				System.out.print("책 제목 : ");
				title = sc.nextLine();
				System.out.print("책 장르 : ");
				genre = sc.nextLine();
				System.out.print("책 저자 : ");
				author = sc.nextLine();
				System.out.print("책 번호 : ");
				num = sc.nextInt();
				sc.nextLine();
				
				for (int i = 0;i<arr.length;i++) {
					if(arr[i] == null) {
						arr[i] = new Book(title, genre, author, num);
						System.out.println("책을 등록하였습니다.");
						break;
					}
					if(i == arr.length-1) {
						System.out.println("등록 가능한 책이 가득 찼습니다.");
						break;
					}
				}
				break;
				
//				if(b1==null) {
//					b1 = tmpBook;
//				}else if(b2==null) {
//					b2=tmpBook;
//				}else if(b3==null) {
//					b3 = tmpBook;
//				}else {
//					System.out.println("등록 가능한 책이 가득 찼습니다.");
//					break;
//				}
//				break;
			case 2:
				System.out.println("==========등록 도서목록==========");
				for(int i = 0;i<arr.length;i++) {
					if(arr[i] == null) {
						break;
					}
					if(arr[i] != null) {
						System.out.println(arr[i].toString());
						System.out.println();
					}
				}
				
				
				
//				if(b1 != null) {
//					System.out.println(b1.toString());
//				}
//				if(b2 != null) {
//					System.out.println(b2.toString());
//				}
//				if(b3 != null) {
//					System.out.println(b3.toString());
//				}
				break;
			case 3:
				System.out.println("==========도서 검색==========");
				
				System.out.print("검색할 책 이름을 입력 : ");
				String str = new String(sc.nextLine());
				boolean exist = false;
				for(int i = 0; i<arr.length;i++) {
					if(arr[i] == null){
						break;
					}
					if(str.equals(arr[i].getTitle())) {
						System.out.println(arr[i].toString());
						exist = true;
					}
				}
				if(exist == false) {
					System.out.println("입력하신 제목의 책은 들옥되어있지 않습니다.");
				}

				
				
//				if(b1 != null&&str.equals(b1.getTitle())) {
//					System.out.println(b1.toString());
//				}
//				else if(b2 != null&&str.equals(b2.getTitle())) {
//					System.out.println(b2.toString());
//				}
//				else if(b3 != null&&str.equals(b3.getTitle())) {
//					System.out.println(b3.toString());
//				}
//				else {
//					System.out.println("입력하신 제목의 책은 들옥되어있지 않습니다.");
//				}
				break;
			case 4:
				System.out.println("==========등록 도서목록==========");
				for(int i = 0;i<arr.length;i++) {
					if(arr[i] == null) {
						break;
					}
					if(arr[i] != null) {
						System.out.println(arr[i].toString());
						System.out.println();
					}
				}
				System.out.print("삭제할 도서의 번호 입력 : ");
				int num2 = sc.nextInt();
				for (int i = 0;i<arr.length;i++) {
					if(arr[i] == null) {
						System.out.println("삭제할 도서의 번호를 찾지 못하였습니다.");
						break;
					}
					else if(arr[i].getBookNum() == num2) {
						System.out.println("삭제 데이터 : " + arr[i].toString()                                                             );
						for(int j = i;j+1<arr.length;j++) {
							if(arr[j] == null) {
								break;
							}
							arr[j] = arr[j+1];
						}
						arr[arr.length - 1] = null;
						System.out.println("삭제 완료.");
						break;
					}
					
				}
				
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				sc.close();
				return;
			default:
				
			}
			
			
		}
		

		
//		Book b1 = new Book();
//		System.out.print("책 제목 : ");
//		b1.setTitle(sc.nextLine());
//		System.out.print("책 장르 : ");
//		b1.setGenre(sc.nextLine());
//		System.out.print("책 저자 : ");
//		b1.setAuthor(sc.nextLine());
//		System.out.print("책 번호 : ");
//		b1.setBookNum(sc.nextInt());
//		sc.nextLine();
//		System.out.println(b1.toString());
		
		
		
		sc.close();
	}
}
