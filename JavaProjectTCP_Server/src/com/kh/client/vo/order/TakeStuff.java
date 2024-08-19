package com.kh.client.vo.order;

import java.io.Serializable;

public class TakeStuff implements Serializable{
	private String Id;
	private String name;
	public TakeStuff(String id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
}
