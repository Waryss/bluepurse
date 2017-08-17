package com.warys.bluepurse.identity.exception;

public class IdentityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8012341961762168814L;
	private String additionalMessage;
	private IdentityErrorCode code;

	public IdentityException() {
		super();
	}

	public IdentityException(IdentityErrorCode code) {
		super(code.getMessage());
		this.code = code;
	}

	public IdentityException(IdentityErrorCode code, String additionalMessage) {
		super(code.getMessage());
		this.code = code;
		this.additionalMessage = additionalMessage;
	}

	public IdentityException(String message) {
		super(message);
	}

	public IdentityErrorCode getCode() {
		return code;
	}

	public void setCode(IdentityErrorCode code) {
		this.code = code;
	}

	public String getAdditionalMessage() {
		return additionalMessage;
	}

	public void setAdditionalMessage(String additionalMessage) {
		this.additionalMessage = additionalMessage;
	}
}
