package com.util;
public class LoginMessage {
	
	private Boolean success;
	private String message;
	
	public LoginMessage() {
		super();
	}
	public LoginMessage(Boolean Success,String Message) {
		this.success=Success;
		this.message=Message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public String getMessage() {
		return message;
	}

}
