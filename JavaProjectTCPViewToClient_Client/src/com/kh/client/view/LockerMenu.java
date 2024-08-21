package com.kh.client.view;

import java.util.Scanner;

import com.kh.client.run.ClientReceive;
import com.kh.client.run.ClientSend;

public class LockerMenu {
	private Scanner sc = new Scanner(System.in);
	private ClientSend cs;
	private ClientReceive cr;
	private String id;
	private int size;
	public String lockerMenu(String id, ClientSend send, ClientReceive receive) {
		this.cs = send;
		this.cr = receive;
		this.id = id;
		while(true) {
			cs.Send("getUser");
			cs.Send(id);
			cs.Flush();
			String name = cr.Receive();
			size = Integer.parseInt(cr.Receive());
			
			
			System.out.println(name + "님, 방문해주셔서 감사합니다.");
			System.out.println(name + "님께서 맡기신 물건의 갯수는");
			System.out.println("총 " + size + "개 입니다.");
			System.out.println("무엇을 하시겠습니까?");
			String str = sc.nextLine();
			if (str.contains("종료")) {
				System.out.println("종료합니다.");
				cs.Send("");
				return null;
			} else if (str.contains("로그아웃")) {
				System.out.println("로그아웃합니다.");
				return "";
			} else if (str.contains("맡기기") || str.contains("맡긴다")) {
				KeepStuff();
				continue;
			} else if (str.contains("찾아") || str.contains("가져")) {
				TakeStuff();
				continue;
			} else if (str.contains("확인")) {
				if (size == 0) {
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

			} 
			else if (str.contains("도움말")) {
				System.out.println("다움과 같은 명령어를 사용할 수 있습니다.");
				System.out.println("물건 맡기기, 물건 찾아가기, 물건 확인하기\n로그아웃, 종료");
			}
			else {
				System.out.println("도움말을 입력하여 명령어를 확인해보세요.");
			}
		}
	}
	
	
	
	
	
	
	

	

	
	private void KeepStuff() {
		System.out.print("맡기실 물건의 이름 : ");
		String str = sc.nextLine();
		System.out.print("맡기실 물건의 종류 : ");
		String str2 = sc.nextLine();
		cs.Send("KeepStuff");
		cs.Send(id);
		cs.Send(str);
		cs.Send(str2);
		cs.Flush();
		if (cr.Receive().equals("true")) {
			System.out.println("물건을 성공적으로 맡아놓았습니다.");
		} else {
			System.out.println("중복된 이름의 물건이 이미 존재합니다.");
		}
	}
	
	private void TakeStuff() {
		System.out.println("가져가실 물건의 이름을 입력해주세요.");
		String name = sc.nextLine();
		cs.Send("TakeStuff");
		cs.Send(id);
		cs.Send(name);
		cs.Flush();
		if (cr.Receive().equals("true")) {
			System.out.println("이용해주셔서 감사합니다.");
		} else {
			System.out.println("해당 이름의 물건이 존재하지 않습니다.");
		}
	}
	
	private void StuffCheck() {
		System.out.println("맡기신 물건의 리스트를 출력합니다.");
		cs.Send("StuffCheck");
		cs.Send(id);
		cs.Flush();
		for(int i = 0; i < size; i++) {
			System.out.println(cr.Receive());
		}
		
	}
	
	private void CheckStuffCategory() {
		System.out.print("확인하실 물건의 종류 : ");
		String category = sc.nextLine();
		cs.Send("CheckStuffCategory");
		cs.Send(id);
		cs.Send(category);
		cs.Flush();
		String result = cr.Receive();
		if (result.equals("")) {
			System.out.println("해당 종류의 물건이 없습니다.");
		}
		else {
			System.out.println("해당 종류의 물건의 정보");
			for(int i = 0; i < Integer.parseInt(result); i++) {
				System.out.println(cr.Receive());
			}
		}
	}
	
	private void CheckStuffName() {
		System.out.print("확인하실 물건의 이름 : ");
		String name = sc.nextLine();
		
		cs.Send("CheckStuffName");
		cs.Send(id);
		cs.Send(name);
		cs.Flush();
		String result = cr.Receive();
		if (result.equals("")) {
			System.out.println("해당 이름은 가진 물건이 없습니다.");
		}
		else {
			System.out.println("해당 이름을 가진 물건의 정보");
			for(int i = 0; i < Integer.parseInt(result); i++) {
				System.out.println(cr.Receive());
			}
		}
	}
}
