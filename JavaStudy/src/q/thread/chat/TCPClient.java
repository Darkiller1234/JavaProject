package q.thread.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
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
	}
}
