package com.warys.bluepurse.identity.exception;

public enum IdentityErrorCode {
	// Technical exceptions from 10 to 99
	I10("Technical error occured"),
	// Business exception from 100 to 999
	I100 ("Business Exception"),
	I101 ("Element not found"),
	I102 ("Element already exists");

	private String message;

	IdentityErrorCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static IdentityErrorCode getDefaultTechnicalCode(){
		return I10;
	}

	public static IdentityErrorCode getDefaultBusinessCode(){
		return I100;
	}
}
