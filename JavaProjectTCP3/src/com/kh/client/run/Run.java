package com.kh.client.run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

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
					Thread receiveTask = new Thread(new ClientReceive(sc));

					Thread sendTask = new Thread(new ClientSend(sc));

					receiveTask.start();
					sendTask.start();
				} catch (Exception e) {
				}

			}
			socket.close();
		} catch (Exception e) {
			return;
		}
		/*
		 * int port; System.out.println("응애"); try { port = br.read();
		 * System.out.println(port); } catch (IOException e) { // TODO Auto-generated
		 * catch block return; } while (true) { try { Socket sk = new
		 * Socket("localhost", port); if (sk != null) { System.out.println("서버와 연결 성공");
		 * Thread receiveTask = new Thread(new ClientReceive(sk));
		 * 
		 * Thread sendTask = new Thread(new ClientSend(sk));
		 * 
		 * receiveTask.start(); sendTask.start(); break; } System.out.println("끼얏호우"); }
		 * catch (Exception e) { continue; }
		 * 
		 * }
		 */
	}
}
