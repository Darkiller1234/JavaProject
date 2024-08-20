package com.kh.client.view;

import com.kh.client.run.ClientReceive;
import com.kh.client.run.ClientSend;

public class MainMenu {
	private ClientSend send;
	private ClientReceive receive;
	private String id = "";
	
	public MainMenu(ClientReceive receive, ClientSend send) {
		this.receive = receive;
		this.send = send;
	}
	
	public void mainMenu() {
		if(id.equals("")) {
			id = new LoginMenu().loginMenu(send, receive);
			System.out.println(id);
		}
	}
}
