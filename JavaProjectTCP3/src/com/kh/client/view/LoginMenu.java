package com.kh.client.view;

import java.util.Scanner;

import com.kh.client.TCP.ClientReceive;
import com.kh.client.TCP.ClientSend;
import com.kh.client.vo.Login;

public class LoginMenu {
	Scanner sc = new Scanner(System.in);
	private ClientSend cs;
	private ClientReceive cr;
	public boolean menu(ClientSend send, ClientReceive receive) {
		cs = send;
		cr = receive;
		while (true) {
			System.out.println("환영합니다.");
			System.out.println("로그인 또는 회원가입을 선택해주세요.");
			String choice = sc.nextLine();
			if (choice.contains("로그인")) {
				if(Login()) {
					
				}
				else
					break;
			} else if (choice.contains("회원가입")) {
				Registor();
			} else if (choice.contains("종료")) {
				System.out.println("종료합니다.");
				send.SendCode(null);
				return false;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		return true;
	}
	public boolean Login() {
		System.out.print("ID : ");
		String Id = sc.nextLine();
		System.out.print("Password : ");
		String Pwd = sc.nextLine();
		cs.SendCode(new Login(Id, Pwd));
		if((boolean) cr.ReceiveCode()) {
			
		}
		return false;
	}
	public boolean Registor() {
		return false;
	}
}
