package com.kh.client.view;

import java.net.Socket;

import com.kh.client.TCP.ClientReceive;
import com.kh.client.TCP.ClientSend;

public class MainMenu {
	private ClientSend send;
	private ClientReceive receive;

	public MainMenu(Socket sc) {
		this.send = new ClientSend(sc);
		this.receive = new ClientReceive(sc);
	}

	public ClientSend getSend() {
		return send;
	}

	public ClientReceive getReceive() {
		return receive;
	}

	public void StartProgram() {
		while (true) {
			String str = new LoginMenu().menu(send, receive);
			if (str != null) {
				if (new LockerMenu(str, send, receive).Menu()) {
					continue;
				}
				else {
					System.out.println("종료합니다.");
					return;
				}
			} else {
				System.out.println("종료합니다.");
				return;
			}
		}

	}
}
