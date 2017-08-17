package com.warys.bluepurse.identity.service;

import com.warys.bluepurse.identity.exception.IdentityException;
import com.warys.bluepurse.identity.payload.response.LoginResponse;

public interface IUserService {

	LoginResponse login(String email, String username, String password) throws IdentityException;
}
