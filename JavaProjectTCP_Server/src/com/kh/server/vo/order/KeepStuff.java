package com.kh.server.vo.order;

public class KeepStuff {
	private String Id;
	private String name;
	private String category;
	public KeepStuff(String id, String name, String category) {
		super();
		Id = id;
		this.name = name;
		this.category = category;
	}
	public String getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	
	
}
