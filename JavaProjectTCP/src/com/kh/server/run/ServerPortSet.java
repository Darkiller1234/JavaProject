package com.kh.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.kh.server.view.LockerMenu;

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
				Connect(socket);

				// 클라이언트에게 메세지를 보내는 쓰레드

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void Connect(Socket socket) {
		try (ServerSocket sc = new ServerSocket(this.port)) {
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw.println(this.port);
			pw.flush();

			System.out.println(this.port);
			System.out.println("서버 연결준비 완료....");
			ArrS.add(sc.accept());
			System.out.println(ArrS.get(ArrayIndex).getInetAddress().getHostAddress() + "에서 연결함...");
			LockerMenu m = new LockerMenu(ArrS.get(ArrayIndex));
			Thread lm = new Thread(m);
			lm.start();
			ArrayIndex++;
			pw.close();
			this.port++;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
