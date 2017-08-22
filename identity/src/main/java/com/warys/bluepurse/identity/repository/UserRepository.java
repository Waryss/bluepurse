package com.warys.bluepurse.identity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.warys.bluepurse.identity.domain.User;

@RepositoryRestResource
public interface UserRepository extends MongoRepository<User, Long> {

	User findByEmailAndPassword(String email, String password);
	
	User findByUsernameAndPassword(String userName, String password);
	
}
