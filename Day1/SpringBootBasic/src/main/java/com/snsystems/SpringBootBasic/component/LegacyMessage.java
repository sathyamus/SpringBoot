package com.snsystems.SpringBootBasic.component;

public class LegacyMessage {

	private String loginMessage;
	private String displayMessage;
	private String errorMessage;

	
	public LegacyMessage() {
		System.out.println("Creating Instance: LegacyMessage");
	}
	
	public String getLoginMessage() {
		return loginMessage;
	}

	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}

	public String getDisplayMessage() {
		return displayMessage;
	}

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
