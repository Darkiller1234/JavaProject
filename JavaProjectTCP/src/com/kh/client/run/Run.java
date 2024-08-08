package com.kh.client.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Run {
	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("localhost", 3000);

		} catch (Exception e) {
			return;
		}
		if (socket != null) {
			BufferedReader br;
			PrintWriter pw;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return;
			}
			int port;
			System.out.println("응애");
			try {
				port = br.read();
				pw.println("");
				System.out.println(port);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return;
			}
			while (true) {
				try {
					Socket sk = new Socket("localhost", port);
					if (sk != null) {
						System.out.println("서버와 연결 성공");
						Thread receiveTask = new Thread(new ClientReceive(sk));

						Thread sendTask = new Thread(new ClientSend(sk));

						receiveTask.start();
						sendTask.start();
						break;
					}
					System.out.println("끼얏호우");
				} catch (Exception e) {
					continue;
				}

			}
			return;
		}
	}
}
