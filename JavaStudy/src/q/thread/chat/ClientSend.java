package q.thread.chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSend implements Runnable{
	private Socket socket;

	public ClientSend(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try (PrintWriter pw = new PrintWriter(socket.getOutputStream());){
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("서버에게 보낼 메세지 : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage); // 입력받은 내용 스트림에 담기
				pw.flush();// 스티림에 담겨있는 내용을 강제로 보냄
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
