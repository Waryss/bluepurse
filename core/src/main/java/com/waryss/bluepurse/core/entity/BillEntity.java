package com.waryss.bluepurse.core.entity;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class BillEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "label")
	private String label;
	@Lob
	@Column(name = "object")
	private Blob object;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "out")
	private OutEntity out;
	@Column(name = "creationdate")
	private Date creationdate;
	@Column(name = "deletionDate")
	private Date deletionDate;

	public Date getCreationdate() {
		return creationdate;
	}
	public Date getDeletionDate() {
		return deletionDate;
	}
	public long getId() {
		return id;
	}
	public String getLabel() {
		return label;
	}
	public Blob getObject() {
		return object;
	}
	public OutEntity getOut() {
		return out;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public void setDeletionDate(Date deletionDate) {
		this.deletionDate = deletionDate;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setObject(Blob object) {
		this.object = object;
	}
	public void setOut(OutEntity out) {
		this.out = out;
	}


}
