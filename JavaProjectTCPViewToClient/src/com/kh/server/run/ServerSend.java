package com.kh.server.run;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend{
	private Socket socket;	
	private PrintWriter pw;
	public ServerSend(Socket socket) {
		super();
		this.socket = socket;
		try {
			pw = new PrintWriter(this.socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Send(String str) {
		pw.println(str);
		pw.flush();
	}
	
}
