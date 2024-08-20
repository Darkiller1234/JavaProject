package com.kh.client.run;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSend{
	private Socket socket;
	private PrintWriter pw;
	public ClientSend(Socket socket) {
		super();
		this.socket = socket;
		try {
			pw = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean Send(String str) {
		pw.println(str);
		if(str.equals("종료")) {
			return false;
		}
		return true;
	}
	public void Flush() {
		pw.flush();
	}
}
