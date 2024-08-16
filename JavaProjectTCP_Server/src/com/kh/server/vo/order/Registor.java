package com.kh.server.vo.order;

public class Registor {
	private String Id;
	private String Pwd;
	private String name;

	public Registor(String id, String pwd, String name) {
		super();
		Id = id;
		Pwd = pwd;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return Id;
	}

	public String getPwd() {
		return Pwd;
	}
}
