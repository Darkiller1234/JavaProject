package com.kh.client.view;

import java.util.Scanner;

import com.kh.client.run.ClientReceive;
import com.kh.client.run.ClientSend;

public class LoginMenu {
	Scanner sc = new Scanner(System.in);
	private ClientSend cs;
	private ClientReceive cr;
	public String loginMenu(ClientSend cs, ClientReceive cr) {
		this.cs = cs;
		this.cr = cr;
		while (true) {
			System.out.println("환영합니다.");
			System.out.println("로그인 또는 회원가입을 선택해주세요.");
			String choice = sc.nextLine();
			if (choice.contains("로그인")) {
				String str = Login();
				if (str != null) {
					return str;
				} else
					System.out.println("로그인 실패. 다시 입력해주세요.");
			} else if (choice.contains("회원가입")) {

				String str = Registor();
				if (str != null) {
					return str;
				} else
					System.out.println("이미 존재하는 Id입니다.");
			} else if (choice.contains("종료")) {
				System.out.println("종료합니다.");
				cs.Send(null);
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
		cs.Send("Login");
		cs.Send(Id);
		cs.Send(Pwd);
		cs.Flush();
		String str = cr.Receive();
		if (str.equals("false")) {
			return null;
		} else {
			return Id;
		}
	}


	public String Registor() {
		System.out.print("ID : ");
		String Id = sc.nextLine();
		System.out.print("Password : ");
		String Pwd = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("ddd");
		cs.Send("Registor");
		cs.Send(name);
		cs.Send(Id);
		cs.Send(Pwd);
		cs.Flush();
		String str = cr.Receive();
		if (str.equals("false")) {
			return null;
		} else {
			return Id;
		}
	}
}
