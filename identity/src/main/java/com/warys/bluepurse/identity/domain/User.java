package com.warys.bluepurse.identity.domain;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2409943120873108673L;

	@Id
	private long id;
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	private String password;
	@NotEmpty(message = "*Please provide a username")
	private String username;
	private String firstname;
	private String lastname;
	private boolean admin;
	private boolean actif;
	private Date subscriptionDate;
	private Date unsubscriptionDate;
	private Date lastUpdateDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
//		PasswordEncoder encoder = new BCryptPasswordEncoder();
//		this.password = encoder.encode(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public Date getUnsubscriptionDate() {
		return unsubscriptionDate;
	}

	public void setUnsubscriptionDate(Date unsubscriptionDate) {
		this.unsubscriptionDate = unsubscriptionDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", login=" + username + ", firstname="
				+ firstname + ", lastname=" + lastname + "]";
	}

}
