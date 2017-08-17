package com.warys.bluepurse.identity.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.warys.bluepurse.identity.builder.ResponseBuilder;
import com.warys.bluepurse.identity.exception.IdentityException;
import com.warys.bluepurse.identity.payload.request.LoginRequest;
import com.warys.bluepurse.identity.payload.response.LoginResponse;
import com.warys.bluepurse.identity.service.IUserService;
import com.warys.bluepurse.identity.utils.ResponseWrapper;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	ResponseWrapper<LoginResponse> getToken(@Valid @RequestBody LoginRequest request) throws IdentityException{
		return new ResponseBuilder<LoginResponse>().buildSucces(userService.login(request.getEmail(), request.getUsername(), request.getPassword()));
	}

}
