package com.kh.client.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceive{
	private Socket socket;
	
	public ClientReceive(Socket socket) {
		super();
		this.socket = socket;
	}

	public String Receive() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
}
