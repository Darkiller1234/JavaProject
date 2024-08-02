package test240712.object;

import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		super();
	}
	
	public void mainMenu() {	//???
		while (true) {
			System.out.println();
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "입니다.");
			if(mc.existMemberNum() == mc.SIZE) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			else {
				System.out.println("1. 새 회원 등록");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				if(mc.existMemberNum() == mc.SIZE) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				this.insertMember();
				break;
			case 2:
				this.searchMember();
				break;
			case 3:
				this.updateMember();
				break;
			case 4:
				this.deleteMember();
				break;
			case 5:
				this.printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void insertMember() {
		String id, name ,password, email, gender; int age;
		System.out.println("새 회원을 등록합니다.");
		while(true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			if(mc.checkId(id)) {
				break;
			}
			else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("비밀번호 : ");
		password = sc.nextLine();
		System.out.print("이메일 : ");
		email = sc.nextLine();
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine();
			if(gender.equals("M")||gender.equals("m")||gender.equals("F")||gender.equals("f")) {
				break;
			}else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.nextLine();
		mc.insertMember(id, name, password, email, gender, age);
		System.out.println();
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:
			this.searchId();
			break;
		case 2:
			this.searchName();
			break;
		case 3:
			this.searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 :");
		String member = mc.searchId(sc.nextLine());
		if(member != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(member);
		}else {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String str = sc.nextLine();
		Member[] mA = mc.searchName(str);
		if (mA[0] != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i = 0; i < mA.length&&mA[i] != null; i++) {
				System.out.println(mA[i].inform());			
			}
		}
		else {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String str = sc.nextLine();
		Member[] mA = mc.searchEmail(str);
		if (mA != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i = 0; i < mc.existMemberNum(); i++) {
				if(mA[i].getEmail().equals(str)) {
					
					System.out.println(mA[i].inform());
				}
			}
		}
		else {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:
			this.updatePassword();
			break;
		case 2:
			this.updateName();
			break;
		case 3:
			this.updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원번호 아이디 : ");
		String str = sc.nextLine();
		System.out.print("수정할 비밀번호 : ");
		String str2 = sc.nextLine();
		if(mc.UpdatePassword(str, str2) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
		else {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		}
	}
	
	public void updateName() {
		System.out.print("수정할 회원번호 아이디 : ");
		String str = sc.nextLine();
		System.out.print("수정할 이름 : ");
		String str2 = sc.nextLine();
		if(mc.updateName(str, str2) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
		else {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원번호 아이디 : ");
		String str = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		String str2 = sc.nextLine();
		if(mc.updateEmail(str, str2) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
		else {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		}
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			this.deleteOne();
			break;
		case 2:
			this.deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String str = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'y' || ch=='Y') {
			if(mc.delete(str) == true) {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			}
			else {
				System.out.println("존재하지 않는 아이디입니다.");
				return;
			}
		}
		else if(ch == 'N' || ch == 'n') {
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'y' || ch=='Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
			return;
		}
		else if(ch == 'N' || ch == 'n') {
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void printAll() {
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		for(int i = 0; i<mc.existMemberNum();i++) {
			System.out.println(mc.printAll()[i].inform());
			
		}

	}
}
