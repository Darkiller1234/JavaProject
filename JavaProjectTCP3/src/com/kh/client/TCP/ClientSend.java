package com.kh.client.TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSend{
	private PrintWriter pw;
	public ClientSend(Socket socket) {
		super();
		try {
			this.pw = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) {
			System.out.println("연결 실패!");
			return;
		}
	}
	
	public void SendCode(Object obj) {
		pw.println(obj);
		pw.flush();
		return;
	}
	
}
