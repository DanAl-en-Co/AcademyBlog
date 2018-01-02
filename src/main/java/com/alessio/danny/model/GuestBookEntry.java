package com.alessio.danny.model;

public class GuestBookEntry {

	private String userName;

	private String message;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "GuestBookEntry [userName=" + userName + ", message=" + message + "]";
	}

}
