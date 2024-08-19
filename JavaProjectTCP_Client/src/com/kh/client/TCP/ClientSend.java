package com.kh.client.TCP;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSend{
	private Socket socket;
	public ClientSend(Socket socket) {
		this.socket = socket;
	}
	
	public synchronized void SendCode(Object obj) {
		try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());) {
			oos.writeObject(obj);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("통신실패!!!!");
		}
		return;
	}
	
}
