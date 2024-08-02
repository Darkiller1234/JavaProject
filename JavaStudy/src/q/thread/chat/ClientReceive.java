package q.thread.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceive implements Runnable{
	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
			while(true) {
				String message = br.readLine();
				System.out.println("서버로부터 전달받은 메세지 : " + message);
			}
		} catch (Exception e) {
		}
	}

	public ClientReceive(Socket socket) {
		super();
		this.socket = socket;
	}

	private Socket socket;
	
}
