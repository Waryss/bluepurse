package com.warys.bluepurse.identity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.warys.bluepurse.identity.domain.Session;
import com.warys.bluepurse.identity.domain.User;

public interface SessionRepository extends MongoRepository<Session, Long> {

	Session findByUser(User user);

}
