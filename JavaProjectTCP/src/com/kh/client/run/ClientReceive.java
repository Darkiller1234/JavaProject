package com.kh.client.run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceive implements Runnable{
	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
			while(true) {
				String message = br.readLine();
				if(message.equals("종료")) {
					return;
				}
				System.out.println(message);
			}
		} catch (Exception e) {
		}
	}

	public ClientReceive(Socket socket) {
		super();
		this.socket = socket;
	}

	private Socket socket;
	
}
