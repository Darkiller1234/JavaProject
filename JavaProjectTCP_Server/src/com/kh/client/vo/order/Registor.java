package com.kh.client.vo.order;

import java.io.Serializable;

public class Registor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
