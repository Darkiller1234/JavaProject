package 끼얏호우;

import java.util.ArrayList;
import java.util.Scanner;

public class LockerMenu {
	private Scanner sc = new Scanner(System.in);
	private LockerController lc = new LockerController();
	
	
	
	public void MainMenu() {
		while(true) {
			if(lc.getUserIndex() == -1) {
				System.out.println("환영합니다.");
				System.out.println("로그인 또는 회원가입을 선택해주세요.");
				String str = sc.nextLine();
				if(str.contains("로그인")) {
					Login();
				}
				else if(str.contains("회원가입")) {
					Registor();
				}
				else if(str.contains("종료")) {
					System.out.println("종료합니다.");
					return;
				}
				else {
					System.out.println("다시 입력해주세요.");
				}
			}
			else if(lc.getUserIndex() == -2){	// 유저별 맡긴 물건 리스트도 출력
				System.out.println("관리자님, 환영합니다.");
				System.out.println("현재 가입한 회원의 수 : " + lc.getUserList().size());
				System.out.println();
				System.out.println("1. 유저 검색");
				System.out.println("2. 유저 삭제");
				System.out.println("3. 유저 목록 확인");
				System.out.println("9. 로그아웃");
				int num = sc.nextInt();
				sc.nextLine();
				switch(num) {
				case 1:
					AdminSearchUser();
					break;
				case 2:
					AdminDeleteUser();
					break;
				case 3:
					AdminCheckUser();
					break;
				case 9:
					System.out.println("로그아웃");
					Logout();
				default:
					System.out.println("다시 입력하세요.");
				}
				
				
			}
			else {
				System.out.println(lc.getUser().getName() + "님, 방문해주셔서 감사합니다.");
				System.out.println(lc.getUser().getName() + "님께서 맡기신 물건의 갯수는 ");
				System.out.println("총 " + lc.getUser().getStuff().size() + "개 입니다.");
				System.out.println("무엇을 하시겠습니까?");
				String str = sc.nextLine();
				if(str.contains("종료")) {
					System.out.println("종료합니다.");
					return;
				}
				else if(str.contains("로그아웃")) {
					System.out.println("로그아웃합니다.");
					Logout();
				}
				else if(str.contains("도움말")) {
					System.out.println("다움과 같은 명령어를 사용할 수 있습니다.");
					System.out.println("물건 맡기기, 물건 찾아가기, 물건 확인하기\n로그아웃, 종료");
				}
				else if(str.contains("맡기기") || str.contains("맡긴다")) {
					KeepStuff();
				}
				else if(str.contains("찾아") || str.contains("가져")) {
					TakeStuff();
				}
				else if(str.contains("확인")) {
					if(lc.getUser().getStuff().size()==0) {
						System.out.println("맡기신 물건이 존재하지 않습니다.");
						continue;
					}
					System.out.println("물건 전체를 확인하시겠습니까? 아니면 물건 이름 또는 물건 종류로 찾아보시겠습니까?");
					String str2 = sc.nextLine();
					if(str2.contains("전체")) {
						StuffCheck();
					}
					else if(str2.contains("이름")) {
						CheckStuffName();
					}
					else if(str2.contains("종류")) {
						CheckStuffCategory();
					}
					else {
						System.out.println("처음부터 다시 입력해주세요.");
					}
					
				}
				
				
				
				
				
				else {
					System.out.println("도움말을 입력하여 명령어를 확인해보세요.");
				}
			}
		}
	}
	
	public void Login() {
		System.out.print("ID : ");
		String Id = sc.nextLine();
		System.out.print("Password : ");
		String Pd = sc.nextLine();
		User u = lc.Login(Id, Pd);
		if(u == null) {
			if(lc.getUserIndex() == -2) {
				return;
			}
			System.out.println("ID 또는 Password 가 일치하지 않습니다.");
			System.out.println();
		} else {
			System.out.println("로그인 성공.");
		}
	}
	
	public void Registor() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("ID : ");
		String Id = sc.nextLine();
		System.out.print("Password : ");
		String Pd = sc.nextLine();
		
		boolean b = lc.Registor(name, Id, Pd);
		if(b==true) {
			System.out.println("회원가입 성공.");
		}
		else {
			System.out.println("아이디가 중복입니다.");
		}
	}
	
	public void Logout() {
		if(lc.Logout() == true) {
			System.out.println("로그아웃 성공.");
			return;
		}
		else {
			System.out.println("에러");
			return;
		}
	}
	
	public void KeepStuff() {
		System.out.println("맡기실 물건의 이름이 뭔가요?");
		String str1 = sc.nextLine();
		System.out.println("맡기실 물건의 종류는 무엇인가요?");
		String str2 = sc.nextLine();
		if(lc.KeepStuff(str1, str2)) {
			System.out.println("물건 맡아놓겠습니다. 감사합니다.");
		}
		else {
			System.out.println("중복된 이름의 물건이 이미 존재합니다.");
		}
	}
	
	public void TakeStuff() {
		System.out.println("가져가실 물건의 이름이 뭔가요?");
		String name = sc.nextLine();
		if(lc.TakeStuff(name)) {
			System.out.println("물건 여기있습니다. 이용해주셔서 감사합니다.");
		}
		else {
			System.out.println("해당 물건이 존재하지 않습니다.");
		}
	}
	
	public void StuffCheck() {				
		System.out.println("맡기신 물건의 리스트를 출력합니다.");
		System.out.println(lc.StuffCheck());
	}
	
	public void CheckStuffName() {
		System.out.println("확인하실 물건의 이름을 입력해주세요.");
		String name = sc.nextLine();
		String str = lc.CheckStuffName(name);
		if(str.equals("")) {
			System.out.println("맡기신 물건 중 " + name + "(은)는 존재하지 않습니다.");
		}
		else {
			System.out.println("요청하신 물건의 정보입니다.");
			System.out.println(str);
		}
	}
	
	public void CheckStuffCategory() {
		System.out.println("확인하실 물건의 종류를 입력해주세요.");
		String category = sc.nextLine();
		String str = lc.CheckStuffCategory(category);
		if(str.equals("")) {
			System.out.println("맡기신 물건 중 " + category + " 종류의 물건은 존재하지 않습니다.");
		}
		else {
			System.out.println(category + "종류의 물건 리스트입니다.");
			System.out.println(str);
		}
	}
	
	public void AdminSearchUser() {
		System.out.println("유저 아이디를 입력하세요.");
		String id = sc.nextLine();
		User u = lc.AdminSearchUser(id);
		if(u == null) {
			System.out.println("해당 아이디를 가진 유저가 없습니다.");
			return;
		}
		else {
			System.out.println("해당 유저의 정보입니다.");
			System.out.println("ID : " + u.getId() + ", Password : " + u.getPd() + ", Name : " + u.getName());
			System.out.println("맡긴 물건 리스트");
			for(int i = 0; i < u.getStuff().size();i++) {
				System.out.println(u.getStuff().get(i).toString());
			}
		}
	}
	
	public void AdminDeleteUser() {
		System.out.println("삭제할 유저의 아이디를 입력하세요.");
		String id = sc.nextLine();
		if(lc.AdminDeleteUser(id)) {
			System.out.println("삭제성공");
		}
		else {
			System.out.println("삭제실패, 해당하는 id가 없습니다.");
		}
	}
	
	public void AdminCheckUser() {
		ArrayList<User> u = lc.AdminCheckUser();
		for(int i = 0; i < u.size();i++) {
			System.out.println("ID : " + u.get(i).getId() + ", Password : " + u.get(i).getPd() + ", Name : " + u.get(i).getName());
			System.out.println("맡긴 물건 리스트");
			for(int j = 0; j < u.get(i).getStuff().size();j++) {
				System.out.println(u.get(i).getStuff().get(j).toString());
			}
			System.out.println();
		}
	}
}
