package test240731.object1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//V(View) : 화면을 담당하는 역할 즉, 사용자에게 보여지는 시각적인 요소(입,출력)
public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴 ");
			System.out.println("2. 손님 메뉴 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴 번호 선택 : ");
			
			int index = sc.nextInt();
			sc.nextLine();
			
			switch(index) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void adminMenu() {
		
		while(true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제 ");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			
			int index = sc.nextInt();
			sc.nextLine();
			
			switch(index) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				System.out.println("메인으로 돌아가기.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void customerMenu() {
		while(true) {
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기 ");
			System.out.println("2. 농산물 빼기 ");
			System.out.println("3. 구입한 농산물 보기 ");
			System.out.println("9. 메인으로 돌아가기 ");
			System.out.print("메뉴 번호 선택 : ");
			
			int index = sc.nextInt();
			sc.nextLine();
			
			switch(index) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				System.out.println("메인으로 돌아가기.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
		
	}
	
	public void addNewKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			switch(num1) {
			case 1:
				System.out.print("이름 : ");
				Fruit f = new Fruit("과일", sc.nextLine());
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				sc.nextLine();
				if(fc.addNewKind(f, amount)) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				}
				else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			case 2:
				System.out.print("이름 : ");
				Vegetable v = new Vegetable("채소", sc.nextLine());
				System.out.print("수량 : ");
				int amount2 = sc.nextInt();
				sc.nextLine();
				if(fc.addNewKind(v, amount2)) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				}
				else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			case 3:
				System.out.print("이름 : ");
				Nut n = new Nut("견과", sc.nextLine());
				System.out.print("수량 : ");
				int amount3 = sc.nextInt();
				sc.nextLine();
				if(fc.addNewKind(n, amount3)) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				}
				else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void removeKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			switch(num1) {
			case 1:
				System.out.print("이름 : ");
				Fruit f = new Fruit("과일", sc.nextLine());
				
				if(fc.removeKind(f)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			case 2:
				System.out.print("이름 : ");
				Vegetable v = new Vegetable("채소", sc.nextLine());
				
				if(fc.removeKind(v)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			case 3:
				System.out.print("이름 : ");
				Nut n = new Nut("견과", sc.nextLine());
				
				if(fc.removeKind(n)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void changeAmount() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			switch(num1) {
			case 1:
				System.out.print("이름 : ");
				Fruit f = new Fruit("과일", sc.nextLine());
				System.out.println("수정할 수량 : ");
				int amount1 = sc.nextInt();
				sc.nextLine();
				
				if(fc.changeAmount(f, amount1)) {
					System.out.println("농산물 수량이 수정되었습니다");
					return;
				}
				else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			case 2:
				System.out.print("이름 : ");
				Vegetable v = new Vegetable("채소", sc.nextLine());
				System.out.println("수정할 수량 : ");
				int amount2 = sc.nextInt();
				sc.nextLine();
				
				if(fc.changeAmount(v, amount2)) {
					System.out.println("농산물 수량이 수정되었습니다");
					return;
				}
				else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			case 3:
				System.out.print("이름 : ");
				Nut n = new Nut("견과", sc.nextLine());
				System.out.println("수정할 수량 : ");
				int amount3 = sc.nextInt();
				sc.nextLine();
				
				if(fc.changeAmount(n, amount3)) {
					System.out.println("농산물 수량이 수정되었습니다");
					return;
				}
				else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
				}
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void printFarm() {
		HashMap<Farm,Integer> hm = fc.printFarm();
		Set keySet = hm.keySet();
		for(Object key : keySet) {
			System.out.println(key + "(" + hm.get(key) + "개)");
		}
	}
	
	public void buyFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			switch(num1) {
			case 1:
				System.out.print("구매할 것 : ");
				Fruit f = new Fruit("과일", sc.nextLine());
				
				if(fc.buyFarm(f)) {
					System.out.println("구매에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
				}
				break;
			case 2:
				System.out.print("구매할 것 : ");
				Vegetable v = new Vegetable("채소", sc.nextLine());
				
				if(fc.buyFarm(v)) {
					System.out.println("구매에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
				}
				break;
			case 3:
				System.out.print("구매할 것 : ");
				Nut n = new Nut("견과", sc.nextLine());
				
				if(fc.buyFarm(n)) {
					System.out.println("구매에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
				}
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void removeFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			switch(num1) {
			case 1:
				System.out.print("구매 취소할 것 : ");
				Fruit f = new Fruit("과일", sc.nextLine());
				
				if(fc.removeFarm(f)) {
					System.out.println("구매 취소에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
				}
				break;
			case 2:
				System.out.print("구매 취소할 것 : ");
				Vegetable v = new Vegetable("채소", sc.nextLine());
				
				if(fc.removeFarm(v)) {
					System.out.println("구매 취소에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
				}
				break;
			case 3:
				System.out.print("구매 취소할 것 : ");
				Nut n = new Nut("견과", sc.nextLine());
				
				if(fc.removeFarm(n)) {
					System.out.println("구매 취소에 성공하였습니다.");
					return;
				}
				else {
					System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
				}
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void printBuyFarm() {
		Iterator e = fc.printBuyFarm().iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
//		Set entrySet = 
	}
}
