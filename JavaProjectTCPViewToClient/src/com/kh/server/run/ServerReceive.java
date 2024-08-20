package com.kh.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import com.kh.server.controller.LockerController;
import com.kh.server.vo.User;

public class ServerReceive implements Runnable{
	private Socket socket;
	private ServerSend sc;
	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;
		sc = new ServerSend(socket);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		LockerController lct = new LockerController();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
			while(true) {
				String message = br.readLine();
				if(message != null && message.equals("Login")) {
					String str1 = "", str2 = "";
					while(!str2.equals("")) {
						String temp = br.readLine();
						if(temp != null) {
							if(str1.equals("")) {
								str1 = temp;
							}
							else
								str2 = temp;
						}
					}
					User u = lct.Login(br.readLine(), br.readLine());
					if(u != null) {
						sc.Send("true");
					}
					else
						sc.Send("false");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
