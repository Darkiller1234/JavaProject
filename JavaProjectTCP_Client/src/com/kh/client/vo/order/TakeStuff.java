package com.kh.client.vo.order;

public class TakeStuff {
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
