package com.warys.bluepurse.identity.payload.response;

import java.io.Serializable;
import java.util.Date;

public class LoginResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -333078477651742283L;

	private String token;
	private Long userId;
	private Long ttl;
	private Date created;

	
	public LoginResponse(String token, long userId, long ttl, Date created) {
		super();
		this.token = token;
		this.userId = userId;
		this.ttl = ttl;
		this.created = created;
	}

	
	public LoginResponse() {
		super();
	}


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getTtl() {
		return ttl;
	}

	public void setTtl(Long ttl) {
		this.ttl = ttl;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
