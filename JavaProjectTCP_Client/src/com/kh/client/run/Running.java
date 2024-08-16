package com.kh.client.run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.kh.client.view.MainMenu;

public class Running {
	private Socket socket;
	private int port;
	private String ip;

	public Running(String ip) {
		super();
		this.ip = ip;
	}

	public void Excute() {
		try {
			socket = new Socket(ip, 3000);
			if (socket != null) {
				System.out.println("서버와 연결 성공");

				try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
					while (true) {
						String message = br.readLine();
						port = Integer.valueOf(message);
						System.out.println(port);
						break;
					}
					Socket sc = new Socket(ip, port);
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
