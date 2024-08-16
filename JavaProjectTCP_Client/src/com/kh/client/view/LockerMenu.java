package com.kh.client.view;

import java.util.Scanner;

import com.kh.client.TCP.ClientReceive;
import com.kh.client.TCP.ClientSend;
import com.kh.client.vo.UserInfo;
import com.kh.client.vo.order.*;

public class LockerMenu {
	private Scanner sc = new Scanner(System.in);
	private String Id;
	private ClientSend cs;
	private ClientReceive cr;
	private UserInfo user;

	public LockerMenu(String id, ClientSend cs, ClientReceive cr) {
		super();
		Id = id;
		this.cs = cs;
		this.cr = cr;
	}

	public boolean Menu() {
		while (true) {
			cs.SendCode(new GetUserInfo(Id));
			user = (UserInfo) cr.ReceiveCode();
			System.out.println(user.getName() + "님, 방문해주셔서 감사합니다.");
			System.out.println(user.getName() + "님께서 맡기신 물건의 갯수는");
			System.out.println("총 " + user.getStuff().size() + "개 입니다.");
			System.out.println("무엇을 하시겠습니까?");
			String str = sc.nextLine();
			if (str.contains("종료")) {
				System.out.println("종료합니다.");
				cs.SendCode(null);
				return false;
			} else if (str.contains("로그아웃")) {
				System.out.println("로그아웃합니다.");
				return true;
			} else if (str.contains("맡기기") || str.contains("맡긴다")) {
				KeepStuff();
				continue;
			} else if (str.contains("찾아") || str.contains("가져")) {
				TakeStuff();
				continue;
			} else if (str.contains("확인")) {
				if (user.getStuff().size() == 0) {
					System.out.println("맡기신 물건이 존재하지 않습니다.");
					continue;
				}
				System.out.println("물건 전체를 확인하시겠습니까? 아니면 물건 이름 또는 물건 종류로 찾아보시겠습니까?");
				String str2 = sc.nextLine();
				if (str2.contains("전체")) {
					StuffCheck();
				} else if (str2.contains("이름")) {
					CheckStuffName();
				} else if (str2.contains("종류")) {
					CheckStuffCategory();
				} else {
					System.out.println("처음부터 다시 입력해주세요.");
				}

			} else {
				System.out.println("도움말을 입력하여 명령어를 확인해보세요.");
			}
		}
	}

	private void CheckStuffCategory() {
		System.out.print("확인하실 물건의 종류 : ");
		String category = sc.nextLine();
		String result = "";
		for(int i = 0; i <user.getStuff().size(); i++) {
			if(user.getStuff().get(i).getCategory().contains(category)) {
				result += user.getStuff().get(i).toString() + "\n";
			}
		}
		if (result.equals("")) {
			System.out.println("해당 종류의 물건이 없습니다.");
		}
		else {
			System.out.println("해당 종류의 물건의 정보");
			System.out.println(result);
		}
	}

	private void CheckStuffName() {
		System.out.print("확인하실 물건의 이름 : ");
		String name = sc.nextLine();
		String result = "";
		for(int i = 0; i <user.getStuff().size(); i++) {
			if(user.getStuff().get(i).getName().contains(name)) {
				result += user.getStuff().get(i).toString() + "\n";
			}
		}
		if (result.equals("")) {
			System.out.println("해당 이름은 가진 물건이 없습니다.");
		}
		else {
			System.out.println("해당 이름을 가진 물건의 정보");
			System.out.println(result);
		}
	}

	private void StuffCheck() {
		System.out.println("맡기신 물건의 리스트를 출력합니다.");
		for(int i = 0; i <user.getStuff().size(); i++) {
			System.out.println(user.getStuff().get(i).toString());
		}
		
	}

	private void KeepStuff() {
		System.out.print("맡기실 물건의 이름 : ");
		String str = sc.nextLine();
		System.out.print("맡기실 물건의 종류 : ");
		String str2 = sc.nextLine();
		cs.SendCode(new KeepStuff(Id, str, str2));
		if ((Boolean) cr.ReceiveCode()) {
			System.out.println("물건을 성공적으로 맡아놓았습니다.");
		} else {
			System.out.println("중복된 이름의 물건이 이미 존재합니다.");
		}
	}

	private void TakeStuff() {
		System.out.println("가져가실 물건의 이름을 입력해주세요.");
		String name = sc.nextLine();
		cs.SendCode(new TakeStuff(Id, name));
		if ((Boolean) cr.ReceiveCode()) {
			System.out.println("물건 여기있습니다. 이용해주셔서 감사합니다.");
		} else {
			System.out.println("해당 이름의 물건이 존재하지 않습니다.");
		}
	}

}
