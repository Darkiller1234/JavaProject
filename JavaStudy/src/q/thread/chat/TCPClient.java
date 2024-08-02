package q.thread.chat;

import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 3000);
			if(socket!=null) {
				System.out.println("서버와 연결 성공");
				
				Thread receiveTask = new Thread(new ClientReceive(socket));
				
				Thread sendTask = new Thread(new ClientSend(socket));

				receiveTask.start();
				sendTask.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
