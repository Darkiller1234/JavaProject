package q.thread.chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend implements Runnable{
	private Socket socket;	
	public ServerSend(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		try (PrintWriter pw = new PrintWriter(socket.getOutputStream());){
			Scanner sc = new Scanner(System.in);
			pw.println(1234);
			pw.flush();
			while(true) {
			
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); //클라이언트에ㅔㄱ 출력
				pw.flush(); //현재 스트림에 있는 데이터를 강제로 내보내기
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
