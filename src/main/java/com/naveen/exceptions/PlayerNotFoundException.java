package com.naveen.exceptions;


public class PlayerNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String msg;

	public PlayerNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public PlayerNotFoundException() {
		super();
	}

	public String getMsg() {
		return msg;
	}

}
