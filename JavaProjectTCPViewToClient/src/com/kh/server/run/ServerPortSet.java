package com.kh.server.run;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerPortSet extends Thread {
	private int port = 3001;
	private ArrayList<Socket> ArrS = new ArrayList<Socket>();
	private int ArrayIndex = 0;

	public void run() {
		while (true) {
			try (ServerSocket ssc = new ServerSocket(3000);) {
				System.out.println("서버 연결준비 완료....");

				Socket socket = ssc.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
				//Connect(socket);

				// 클라이언트에게 메세지를 보내는 쓰레드
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(port);
				pw.flush();
				
				try (ServerSocket sssc = new ServerSocket(port)) {
					ArrS.add(sssc.accept());
					
					ServerReceive m = new ServerReceive(ArrS.get(ArrayIndex));
					Thread lm = new Thread(m);
					lm.start();
				}
				ArrayIndex++;
				this.port++;
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
