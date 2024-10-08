package com.kh.controller;

import java.util.ArrayList;

import com.kh.vo.Stuff;
import com.kh.vo.User;

public class LockerController {
	static private ArrayList<User> user = new ArrayList<User>();
	private int userIndex = -1;

	public User Login(String id, String pd) {
		if(id.equals("admin") && pd.equals("admin")) {
			userIndex = -2;
			return null;
		}
		for (int i = 0; i < user.size(); i++) {
			if (user.get(i).getId().equals(id) && user.get(i).getPd().equals(pd)) {
				userIndex = i;
				return user.get(i);
			}
		}

		return null;
	}

	public boolean Registor(String name, String id, String pd) {
		for (int i = 0; i < user.size(); i++) {
			if (user.get(i).getId().equals(id)) {
				return false;
			}
		}
		user.add(new User(name, id, pd));
		userIndex = user.size() - 1;
		return true;
	}

	public boolean Logout() {
		userIndex = -1;
		return true;
	}

	public boolean KeepStuff(String name, String category) {
		for (int i = 0; i < user.get(userIndex).getStuff().size(); i++) {
			if (user.get(userIndex).getStuff().get(i).getName().equals(name)) {
				return false;
			}
		}
		user.get(userIndex).getStuff().add(new Stuff(name, category));
		return true;
	}
	
	public boolean TakeStuff(String name) {
		for(int i = 0; i < user.get(userIndex).getStuff().size(); i++) {
			if(user.get(userIndex).getStuff().get(i).getName().equals(name)) {
				user.get(userIndex).getStuff().remove(i);
				return true;
			}
		}
		return false;
	}
	
	public String StuffCheck() {
		String str = "";
		for(int i = 0; i < user.get(userIndex).getStuff().size(); i++){
			str += (user.get(userIndex).getStuff().get(i).toString() + "\n");
		}
		
		
		return str;
	}
	
	public String CheckStuffName(String name) {
		String str = "";
		for(int i = 0; i < user.get(userIndex).getStuff().size(); i++) {
			if(user.get(userIndex).getStuff().get(i).getName().equals(name)) {
				str += user.get(userIndex).getStuff().get(i).toString() + "\n";
			}
		}
		return str;
	}
	
	public String CheckStuffCategory(String category) {
		String str = "";
		for(int i = 0; i < user.get(userIndex).getStuff().size(); i++) {
			if(user.get(userIndex).getStuff().get(i).getCategory().equals(category)) {
				str += user.get(userIndex).getStuff().get(i).toString() + "\n";
			}
		}
		return str;
	}
	
	
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
	
	
	
	
	
	
	
	

	public User getUser() {
		return user.get(userIndex);
	}

	public int getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(int userIndex) {
		this.userIndex = userIndex;
	}
	
	public ArrayList<User> getUserList() {
		return user;
	}
}
