package com.kh.client.TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientReceive{
	private Socket socket;
	

	public ClientReceive(Socket socket) {
		this.socket = socket;
	}
	public synchronized Object ReceiveCode() {
		
		try (ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());){
			
			return ois.readObject();
		} catch (IOException e) {
			System.out.println(e);
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
