package com.waryss.bluepurse.core.entity.param;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "param_usergroup")
public class UserGroupEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "code")
	private int code;

	@Column(name = "label")
	@Basic(optional = false)
	private String label;

	@Column(name = "level")
	@Basic(optional = false)
	private int level;

	@Column(name = "inddefaul")
	@Basic(optional = false)
	private boolean inddefaul;

	public int getCode() {
		return code;
	}

	public boolean getInddefaul() {
		return inddefaul;
	}

	public String getLabel() {
		return label;
	}

	public int getLevel() {
		return level;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setInddefaul(boolean inddefaul) {
		this.inddefaul = inddefaul;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
