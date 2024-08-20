package com.kh.client.run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.kh.client.view.MainMenu;

public class Run {
	public static void main(String[] args) {
		Socket socket;
		int port;
		try {
			socket = new Socket("192.168.30.192", 3000);
			if (socket != null) {
				System.out.println("서버와 연결 성공");

				try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
					while (true) {
						String message = br.readLine();
						port = Integer.valueOf(message);
						System.out.println(port);
						break;
					}
					Socket sc = new Socket("192.168.30.192", port);
					ClientReceive receiveTask = new ClientReceive(sc);

					ClientSend sendTask = new ClientSend(sc);

					new MainMenu(receiveTask, sendTask).mainMenu();
				} catch (Exception e) {
				}

			}
			socket.close();
		} catch (Exception e) {
			return;
		}
	}
}
