package com.kh.server.TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;

import com.kh.client.vo.order.GetUserInfo;
import com.kh.client.vo.order.KeepStuff;
import com.kh.client.vo.order.Login;
import com.kh.client.vo.order.Registor;
import com.kh.client.vo.order.TakeStuff;
import com.kh.client.vo.order.TrueFalse;
import com.kh.server.controller.ServerController;
import com.kh.server.vo.UserInfo;

public class ServerReceive implements Runnable {
	private Socket socket;
	private ServerSend sc;
	private ObjectInputStream ois;
	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;
		sc = new ServerSend(socket);
		try {
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		ServerController sct = new ServerController(socket);
		
		try  {
			while (true) {
				Object message = ois.readObject();
				System.out.println("응애");
				if (message instanceof GetUserInfo) {
					sc.Send((UserInfo) sct.GetUserInfo((GetUserInfo) message));
				} else if (message instanceof Login) {
					sc.Send(new TrueFalse( sct.Login((Login) message)));
				} else if (message instanceof Registor) {
					System.out.println("응애");
					sc.Send(new TrueFalse(sct.Registor((Registor) message)));
					System.out.println("응애");
				} else if (message instanceof TakeStuff) {
					sc.Send(new TrueFalse(sct.TakeStuff((TakeStuff) message)));
				} else if (message instanceof KeepStuff) {
					sc.Send(new TrueFalse(sct.KeepStuff((KeepStuff) message)));
				} else {
					System.out.println("오류!오류!오류!");
				}
				ois.close();
			}
		} catch (SocketException e) {
		    System.err.println("Connection reset: " + e.getMessage());
		    // Handle the error, e.g., retry the connection or notify the user
		} catch (IOException e) {
		    System.err.println("I/O error: " + e.getMessage());
		    // Handle other I/O errors
		} catch (ClassNotFoundException e) {
		    System.err.println("Class not found: " + e.getMessage());
		    // Handle class not found error
		}

	}

}
