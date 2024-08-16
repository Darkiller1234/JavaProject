package com.kh.server.controller;

import java.net.Socket;
import java.util.ArrayList;

import com.kh.server.TCP.ServerSend;
import com.kh.server.vo.*;
import com.kh.server.vo.order.*;

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
					if(user.get(userindex).getStuff().get(j).getName().equals(ks.getName())) {
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
		int userindex;
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).getId().equals(ts.getId())) {
				userindex = i;
				for(int j = 0; j < user.get(userindex).getStuff().size(); j++) {
					if(user.get(userindex).getStuff().get(j).getName().equals(ts.getName())) {
						user.get(userindex).getStuff().remove(j);
						return true;
					}
				}
			}
		}
		return false;
	}
}
