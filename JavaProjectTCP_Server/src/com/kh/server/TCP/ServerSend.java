package com.kh.server.TCP;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSend{
	private Socket socket;
	public ServerSend(Socket socket) {
		super();
		this.socket = socket;
	}
	
	public synchronized void Send(Object obj) {
		System.out.println("끼얏호우!");
		try {
			ObjectOutputStream oos1 = new ObjectOutputStream(socket.getOutputStream());
			oos1.writeObject(obj);
			oos1.flush();
			System.out.println("끼얏호우!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
