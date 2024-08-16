package com.kh.server.vo;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
	private String Id;
	private String Pwd;	
	private String name;
	
	private List<Stuff> stuff = new ArrayList<Stuff>();

	public UserInfo(String id, String pwd, String name) {
		super();
		Id = id;
		Pwd = pwd;
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public String getPwd() {
		return Pwd;
	}

	public String getName() {
		return name;
	}

	public List<Stuff> getStuff() {
		return stuff;
	}

	public void setId(String id) {
		Id = id;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStuff(List<Stuff> stuff) {
		this.stuff = stuff;
	}
}
