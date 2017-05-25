package com.waryss.bluepurse.core.entity;


import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.waryss.bluepurse.core.entity.param.StatusEntity;
import com.waryss.bluepurse.core.entity.param.UserGroupEntity;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	@Basic(optional = false)
	private String password;
	@Column(name = "login")
	private String login;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usergroup")
	private UserGroupEntity userGroup;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status")
	private StatusEntity status;
	@Column(name = "subscriptiondate")
	private Date subscriptionDate;
	@Column(name = "unsubscriptiondate")
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

	public StatusEntity getStatus() {
		return status;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public Date getUnsubscriptionDate() {
		return unsubscriptionDate;
	}

	public UserGroupEntity getUserGroup() {
		return userGroup;
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

	public void setStatus(StatusEntity status) {
		this.status = status;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public void setUnsubscriptionDate(Date unsubscriptionDate) {
		this.unsubscriptionDate = unsubscriptionDate;
	}

	public void setUserGroup(UserGroupEntity userGroup) {
		this.userGroup = userGroup;
	}
}
