package com.waryss.bluepurse.identity.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;

public class UserEntity {
	@Id
	private long id;
	private String email;
	private String password;
	private String login;
	private String firstname;
	private String lastname;
	// private UserGroupEntity userGroup;
	// private StatusEntity status;
	private Date subscriptionDate;
	private Date unsubscriptionDate;

	public String getEmail() {
		return email;
	}

	public String getFirstname() {
		return firstname;
	}

	public long getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public Date getUnsubscriptionDate() {
		return unsubscriptionDate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public void setUnsubscriptionDate(Date unsubscriptionDate) {
		this.unsubscriptionDate = unsubscriptionDate;
	}
}
