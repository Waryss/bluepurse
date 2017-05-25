package com.waryss.bluepurse.core.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.waryss.bluepurse.core.entity.param.RecurrencyEntity;

@Entity
@Table(name = "in")
@NamedQueries({
	@NamedQuery(name = "findInByIdAndUser", query = "from InEntity  i where i.id = :id and i.user = :user"),
	@NamedQuery(name = "findInsByUser", query = "from InEntity  i where i.user = :user") })
public class InEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "label")
	private String label;
	@Column(name = "amount")
	private float amount;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "recurrence")
	private RecurrencyEntity recurrence;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user")
	private UserEntity user;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Chargegroup")
	private BucketEntity group;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "purse")
	private PurseEntity purse;
	@Column(name = "creationdate")
	private Date creationDate;
	@Column(name = "updatedate")
	private Date updateDate;
	@Column(name = "deletedate")
	private Date deleteDate;

	public float getAmount() {
		return amount;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public BucketEntity getGroup() {
		return group;
	}

	public long getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public RecurrencyEntity getRecurrence() {
		return recurrence;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public void setGroup(BucketEntity group) {
		this.group = group;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setRecurrence(RecurrencyEntity recurrence) {
		this.recurrence = recurrence;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
}
