package com.kh.client.view;

import java.util.Scanner;

import com.kh.client.TCP.ClientReceive;
import com.kh.client.TCP.ClientSend;
import com.kh.client.vo.order.Login;
import com.kh.client.vo.order.Registor;

public class LoginMenu {
	Scanner sc = new Scanner(System.in);
	private ClientSend cs;
	private ClientReceive cr;
	public String menu(ClientSend send, ClientReceive receive) {
		cs = send;
		cr = receive;
		while (true) {
			System.out.println("환영합니다.");
			System.out.println("로그인 또는 회원가입을 선택해주세요.");
			String choice = sc.nextLine();
			if (choice.contains("로그인")) {
				String str = Login();
				if(str != null) {
					return str;
				}
				else
					System.out.println("로그인 실패. 다시 입력해주세요.");
			} else if (choice.contains("회원가입")) {
				String str = Registor();
				if(str != null) {
					return str;
				}
				else
					System.out.println("이미 존재하는 Id입니다.");
			} else if (choice.contains("종료")) {
				System.out.println("종료합니다.");
				send.SendCode(null);
				return null;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	public String Login() {
		System.out.print("ID : ");
		String Id = sc.nextLine();
		System.out.print("Password : ");
		String Pwd = sc.nextLine();
		cs.SendCode(new Login(Id, Pwd));
		if((boolean) cr.ReceiveCode()) {
			return Id;
		}
		return null;
	}
	public String Registor() {
		System.out.print("ID : ");
		String Id = sc.nextLine();
		System.out.print("Password : ");
		String Pwd = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		cs.SendCode(new Registor(Id, Pwd, name));
		if((boolean) cr.ReceiveCode()) {
			return Id;
		}
		
		return null;
	}
}
