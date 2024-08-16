package com.kh.client.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceive{
	private BufferedReader br;
	
	

	public ClientReceive(Socket socket) {
		super();
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println("오류!오류!");
			System.out.println("클라리시버에서 오류!");
		}
	}
	public Object ReceiveCode() {
		try {
			return (Object)br.readLine();
		} catch (IOException e) {
			System.out.println("통신이 끊어졌다!");
			return null;
		}
	}
}
