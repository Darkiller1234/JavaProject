package com.kh.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

import com.kh.server.controller.LockerController;
import com.kh.server.vo.User;

public class ServerReceive implements Runnable {
	private Socket socket;
	private ServerSend sc;
	private BufferedReader br;
	private LockerController lct = new LockerController();

	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;
		sc = new ServerSend(socket);
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			while (true) {
				String message = br.readLine();
				if (message != null) {
					if (message.equals("Login")) {
						String str1 = "", str2 = "";
						User u = lct.Login(br.readLine(), br.readLine());
						if (u != null) {
							sc.Send("true");
						} else
							sc.Send("false");
					}
					else if(message.equals("Registor")) {
						Boolean b = lct.Registor(br.readLine(), br.readLine(), br.readLine());
						if (b = true) {
							sc.Send("true");
						}
						else
							sc.Send("false");
					}
					else if(message.equals("getUser")) {
						User u = lct.getUser(br.readLine());
						sc.Send(u.getName());
						sc.Send(String.valueOf(lct.StuffSize(u.getId())));
					}
					else if(message.equals("KeepStuff")) {
						if(lct.KeepStuff(br.readLine(), br.readLine(), br.readLine())) {
							sc.Send("true");
						}else {
							sc.Send("false");
						}
					}
					else if(message.equals("TakeStuff")) {
						if(lct.TakeStuff(br.readLine(), br.readLine())) {
							sc.Send("true");
						}else
							sc.Send("false");
					}
					else if(message.equals("StuffCheck")) {
						List<String> list = lct.StuffCheck(br.readLine());
						if(list != null) {
							for(int i = 0; i < list.size(); i++) {
								sc.Send(list.get(i));
							}
						}
						else {
							sc.Send("");
						}
					}
					else if(message.equals("CheckStuffCategory")) {
						List<String> list = lct.StuffCheck(br.readLine());
						if(list != null) {
							sc.Send(Integer.toString(list.size()));
							for(int i = 0; i < list.size(); i++) {
								sc.Send(list.get(i));
							}
						}
						else {
							sc.Send("");
						}
					}
					else if(message.equals("CheckStuffName")) {
						List<String> list = lct.StuffCheck(br.readLine());
						if(list != null) {
							sc.Send(Integer.toString(list.size()));
							for(int i = 0; i < list.size(); i++) {
								sc.Send(list.get(i));
							}
						}
						else {
							sc.Send("");
						}
						
					}
				}
			}
		} catch (IOException e) {
			System.out.println("연결끊김!");
		}
	}

}
