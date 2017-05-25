package com.waryss.bluepurse.core.entity.param;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "param_buckettype")
public class BucketTypeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "code")
	private int code;
	@Column(name = "label")
	@Basic(optional = false)
	private String label;
	@Column(name = "inddefaul")
	@Basic(optional = false)
	private boolean inddefault;

	public int getCode() {
		return code;
	}

	public boolean getInddefault() {
		return inddefault;
	}

	public String getLabel() {
		return label;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setInddefault(boolean inddefault) {
		this.inddefault = inddefault;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
