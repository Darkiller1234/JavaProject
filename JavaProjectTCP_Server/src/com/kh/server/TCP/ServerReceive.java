package com.kh.server.TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.kh.server.controller.ServerController;
import com.kh.server.vo.order.*;

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
		ServerController sct = new ServerController(socket);
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
			while(true) {
				Object message = (Object)br.readLine();
				if(message instanceof Login) {
					sc.Send((Boolean)sct.Login((Login)message));
				} else if(message instanceof Registor) {
					sc.Send((Boolean)sct.Registor((Registor)message));
				}else if(message instanceof TakeStuff) {
					sc.Send((Boolean)sct.TakeStuff((TakeStuff)message));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
