package com.kh.server.controller;

import java.net.Socket;
import java.util.ArrayList;

import com.kh.client.vo.order.GetUserInfo;
import com.kh.client.vo.order.KeepStuff;
import com.kh.client.vo.order.Login;
import com.kh.client.vo.order.Registor;
import com.kh.client.vo.order.TakeStuff;
import com.kh.server.TCP.ServerSend;
import com.kh.server.vo.Stuff;
import com.kh.server.vo.UserInfo;

public class ServerController {
	static private ArrayList<UserInfo> user = new ArrayList<UserInfo>();
	
	
	private Socket socket;
	private ServerSend ss;
	public ServerController(Socket socket) {
		super();
		this.socket = socket;
		ss = new ServerSend(this.socket);
	}
	
	public boolean Login(Login l) {
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).getId().equals(l.getId()) && user.get(i).getPwd().equals(l.getPwd())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean Registor(Registor r) {
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).getId().equals(r.getId())) {
				return false;
			}
		}
		user.add(new UserInfo(r.getId(), r.getPwd(), r.getPwd()));
		return true;
	}
	
	public boolean KeepStuff(KeepStuff ks) {
		int userindex;
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).getId().equals(ks.getId())) {
				userindex = i;
				for(int j = 0; j < user.get(userindex).getStuff().size(); j++) {
					if(((Stuff) user.get(userindex).getStuff().get(j)).getName().equals(ks.getName())) {
						return false;
					}
				}
				user.get(userindex).getStuff().add(new Stuff(ks.getName(), ks.getCategory()));
				return true;
			}
		}
		
		return false;
	}
	
	public boolean TakeStuff(TakeStuff ts) {
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).getId().equals(ts.getId())) {
				for(int j = 0; j < user.get(i).getStuff().size(); j++) {
					if(((Stuff) user.get(i).getStuff().get(j)).getName().equals(ts.getName())) {
						user.get(i).getStuff().remove(j);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public UserInfo GetUserInfo(GetUserInfo ui) {
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).getId().equals(ui.getId())) {
				return user.get(i);
			}
		}
		return null;
	}
}
