package com.kh.server.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.server.service.StuffService;
import com.kh.server.service.UserService;
import com.kh.server.vo.Stuff;
import com.kh.server.vo.User;

public class LockerController {
	private int userIndex = -1;

	public boolean Registor(String name, String id, String pd) {
		int result = new UserService().Registor(new User(name, id, pd));
		if(result > 0) {
			return true;
		}
		else
			return false;
	}
	
	public User Login(String id, String pd) {
		if(id.equals("admin") && pd.equals("admin")) {
			userIndex = -2;
			return null;
		}
		User u = new UserService().Login(id, pd);
		if(u != null) {
			return u;
		}
		return null;
	}

	public boolean Logout() {
		userIndex = -1;
		return true;
	}

	public boolean KeepStuff(String id, String name, String category) {
		int result = new StuffService().KeepSutff(id, name, category);
		if(result > 0) {
			return true;
		}
		else
			return false;
	}
	
	public boolean TakeStuff(String id, String name) {
		int result = new StuffService().TakeStuff(id, name);
		if(result > 0) {
			return true;
		}
		else
			return false;
	}
	
	public List<String> StuffCheck(String id) {
		List<Stuff> list = new StuffService().StuffCheck(id);
		List<String> str = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			str.add(list.get(i).toString());
		}
		
		return str;
	}
	
	public List<String> CheckStuffName(String id, String name) {
		List<Stuff> list = new StuffService().CheckStuffName(id, name);
		List<String> str = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			str.add(list.get(i).toString());
		}
		return str;
	}
	
	public List<String> CheckStuffCategory(String id, String category) {
		List<Stuff> list = new StuffService().CheckStuffCategory(id, category);
		List<String> str = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			str.add(list.get(i).toString());
		}
		return str;
	}
	
	
	public int StuffSize(String id) {
		return new StuffService().StuffCheck(id).size();
	}
	
	
	/*
	public User AdminSearchUser(String id) {
		for(int i = 0; i < user.size();i++) {
			if(user.get(i).getId().equals(id)) {
				return user.get(i);
			}
		}
		return null;
	}
	
	public boolean AdminDeleteUser(String id) {
		for(int i = 0; i < user.size();i++) {
			if(user.get(i).getId().equals(id)) {
				user.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	public ArrayList<User> AdminCheckUser(){
		return user;
	}
	
	
	*/
	
	
	
	
	

	public User getUser(String id) {
		return new UserService().getUser(id);
	}

	public int getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(int userIndex) {
		this.userIndex = userIndex;
	}
}
