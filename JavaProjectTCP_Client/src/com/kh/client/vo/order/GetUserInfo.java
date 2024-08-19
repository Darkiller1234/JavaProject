package com.kh.client.vo.order;

import java.io.Serializable;

public class GetUserInfo implements Serializable{
	private String Id;

	public GetUserInfo(String id) {
		super();
		Id = id;
	}

	public String getId() {
		return Id;
	}
}
