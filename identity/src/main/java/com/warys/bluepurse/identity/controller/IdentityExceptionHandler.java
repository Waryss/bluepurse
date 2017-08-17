package com.warys.bluepurse.identity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.warys.bluepurse.identity.builder.ResponseBuilder;
import com.warys.bluepurse.identity.exception.IdentityException;
import com.warys.bluepurse.identity.utils.ResponseWrapper;

@ControllerAdvice
public class IdentityExceptionHandler {

	@ExceptionHandler(IdentityException.class)
	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	@ResponseBody
	public ResponseWrapper<?> handleException(IdentityException ex) {
		return new ResponseBuilder<IdentityException>().buildError(ex);
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	@ResponseBody
	public ResponseWrapper<?> handleException(Exception ex) {
		return new ResponseBuilder<Exception>().buildError(ex);
	}
}
