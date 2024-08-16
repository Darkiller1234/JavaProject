package com.kh.server.vo.order;

public class Login {
	private String Id;
	private String Pwd;
	public Login(String id, String pwd) {
		super();
		Id = id;
		Pwd = pwd;
	}
	public String getId() {
		return Id;
	}
	public String getPwd() {
		return Pwd;
	}
}
