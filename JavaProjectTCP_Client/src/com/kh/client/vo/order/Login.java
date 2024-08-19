package com.kh.client.vo.order;

import java.io.Serializable;

public class Login implements Serializable{
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
