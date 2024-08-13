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
		
	}
}
