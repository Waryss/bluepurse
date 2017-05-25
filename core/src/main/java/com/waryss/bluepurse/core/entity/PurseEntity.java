package com.waryss.bluepurse.core.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "planner")
@NamedQueries({
	@NamedQuery(name = "findPurseByCreator", query = "from PurseEntity  i where i.id = :id and i.user = :user"),
	@NamedQuery(name = "findPursesByCreator", query = "from PurseEntity  i where i.user = :user") })
public class PurseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user")
	@Basic(optional = false)
	private UserEntity user;
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "contribution", joinColumns = { @JoinColumn(name = "purse") }, inverseJoinColumns = {
			@JoinColumn(name = "user") })
	private Set<UserEntity> contribution;
	@Column(name = "creationdate")
	private Date creationDate;
	@Column(name = "closedate")
	private Date closeDate;

	public Date getCloseDate() {
		return closeDate;
	}

	public Set<UserEntity> getContribution() {
		return contribution;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public void setContribution(Set<UserEntity> contribution) {
		this.contribution = contribution;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}
