package com.warys.bluepurse.identity.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.warys.bluepurse.identity.domain.Session;
import com.warys.bluepurse.identity.domain.User;
import com.warys.bluepurse.identity.exception.IdentityErrorCode;
import com.warys.bluepurse.identity.exception.IdentityException;
import com.warys.bluepurse.identity.payload.response.LoginResponse;
import com.warys.bluepurse.identity.repository.SessionRepository;
import com.warys.bluepurse.identity.repository.UserRepository;
import com.warys.bluepurse.identity.service.IUserService;
import com.warys.bluepurse.identity.utils.HashUtil;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SessionRepository sessionRepository;

	@Override
	public LoginResponse login(String email, String username, String password) throws IdentityException {

		User user = getUser(email, username, password);

		if (sessionRepository.findByUser(user) != null) {
			throw new IdentityException(IdentityErrorCode.I102, "Cet utilisateur est déjà connecté");
		}

		String token = HashUtil.generateHash(user.toString());
		Session session = new Session(token, user, 86400, new Date());
		sessionRepository.save(session);

		return new LoginResponse(session.getToken(), session.getUser().getId(), session.getTtl(),
				session.getCreationDate());
	}

	private User getUser(String email, String username, String password) throws IdentityException {

		User user = null;
		if (!StringUtils.isEmpty(email)) {
			user = userRepository.findByEmailAndPassword(email, password);
		} else if (!StringUtils.isEmpty(username)) {
			user = userRepository.findByUsernameAndPassword(username, password);
		} else {
			throw new IdentityException(IdentityErrorCode.I100, "Le champ [username] ou [email] doit être spécifié");
		}

		if (null == user) {
			throw new IdentityException(IdentityErrorCode.I101, "Aucun user ne correspond aux credentials passés");
		}

		return user;
	}
}
