package com.warys.bluepurse.identity.builder;

import com.warys.bluepurse.identity.exception.IdentityErrorCode;
import com.warys.bluepurse.identity.exception.IdentityException;
import com.warys.bluepurse.identity.utils.ResponseWrapper;
import com.warys.bluepurse.identity.utils.ResponseWrapper.Severity;

public class ResponseBuilder<T> {

	private ResponseWrapper<T> responseWrapper;

	public ResponseBuilder() {
		responseWrapper = new ResponseWrapper<T>();
	}

	public ResponseBuilder<T> addMessage(String message) {
		responseWrapper.setMessage(message);
		return this;
	}

	public ResponseBuilder<T> addDetails(String details) {
		responseWrapper.setDetails(details);
		return this;
	}

	public ResponseBuilder<T> addSeverity(Severity severity) {
		responseWrapper.setSeverity(severity);
		return this;
	}

	public ResponseBuilder<T> addResult(T result) {
		responseWrapper.setResult(result);
		return this;
	}

	public ResponseBuilder<T> addCode(String code) {
		responseWrapper.setCode(code);
		return this;
	}

	public ResponseWrapper<T> buildSucces(T result) {
		addSeverity(ResponseWrapper.Severity.SUCCESS).addMessage("Successfully ended").addResult(result);
		return responseWrapper;
	}
	
	/*
	 * Build error response for all IdentityException exceptions
	 */
	public ResponseWrapper<?> buildError(IdentityException ex) {
		addSeverity(ResponseWrapper.Severity.ERROR).addCode(ex.getCode().name()).addMessage(ex.getMessage()).addDetails(ex.getAdditionalMessage());
		return responseWrapper;
	}

	/*
	 * Build default response for any other exceptions
	 */
	public ResponseWrapper<?> buildError(Exception ex) {
		addSeverity(ResponseWrapper.Severity.ERROR).addCode(IdentityErrorCode.getDefaultTechnicalCode().name()).addMessage(IdentityErrorCode.getDefaultTechnicalCode().getMessage()).addDetails(ex.getMessage());
		return responseWrapper;
	}
}
