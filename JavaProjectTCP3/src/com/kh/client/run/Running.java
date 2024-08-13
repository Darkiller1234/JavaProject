package com.kh.client.run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.kh.client.view.MainMenu;

public class Running {
	private Socket socket;
	private int port;

	public Running() {
		super();
	}

	public void Excute() {
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
					new MainMenu(sc).StartProgram();
				} catch (Exception e) {
				}
				socket.close();
			}
		} catch (Exception e) {
			return;
		}
	}
}
