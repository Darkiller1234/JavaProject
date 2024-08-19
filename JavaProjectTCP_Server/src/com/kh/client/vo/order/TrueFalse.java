package com.kh.client.vo.order;

import java.io.Serializable;

public class TrueFalse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean result;

	public TrueFalse(boolean result) {
		super();
		this.result = result;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
}
