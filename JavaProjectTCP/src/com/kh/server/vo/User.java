package com.kh.server.vo;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String Id;
	private String Pd;
	private String name;
	
	private List<Stuff> stuff = new ArrayList<Stuff>();
	
	
	
	
	
	
	
	public User(String name, String id, String pd ) {
		super();
		Id = id;
		Pd = pd;
		this.name = name;
	}
	
	
	public String getId() {
		return Id;
	}
	public String getPd() {
		return Pd;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setPd(String pd) {
		Pd = pd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public List<Stuff> getStuff() {
		return stuff;
	}


	public void setStuff(List<Stuff> stuff) {
		this.stuff = stuff;
	}
	
	
	
	
}
