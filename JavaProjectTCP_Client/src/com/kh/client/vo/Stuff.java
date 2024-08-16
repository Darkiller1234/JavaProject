package com.kh.client.vo;

public class Stuff {
	private String name;
	private String Category;
	public Stuff(String name, String category) {
		super();
		this.name = name;
		Category = category;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return Category;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 종류 : " + Category;
	}
}
