package com.warys.bluepurse.identity.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Session implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6305501310813174961L;

	@Id
	private String token;
	private User user;
	private long ttl;
	private Date creationDate;

	
	public Session(String token, User user, long ttl, Date creationDate) {
		super();
		this.token = token;
		this.user = user;
		this.ttl = ttl;
		this.creationDate = creationDate;
	}

	
	public Session() {
		super();
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getTtl() {
		return ttl;
	}

	public void setTtl(long ttl) {
		this.ttl = ttl;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date date) {
		this.creationDate = date;
	}

}
