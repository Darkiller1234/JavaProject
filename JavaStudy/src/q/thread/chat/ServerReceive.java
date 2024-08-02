package q.thread.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive implements Runnable{
	private Socket socket;
	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
			while(true) {
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;
	}
}
