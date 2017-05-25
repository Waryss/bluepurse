package com.waryss.bluepurse.core.entity.param;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "param_info")
@NamedQueries({
	@NamedQuery(name = "findInfoByCode", query = "from Param_InfoEntity  i where i.code = :code") })
public class InfoEntity {
	@Id
	@Column(name = "code")
	@Basic(optional = false)
	private String code;
	@Column(name = "value")
	@Basic(optional = false)
	private String value;

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
