package com.kh.server.TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

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
	
	public void Send(Object obj) {
		pw.println(obj);
		pw.flush();
	}
	
}
