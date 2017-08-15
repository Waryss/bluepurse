package com.warys.bluepurse.identity.domain;

public class UserGroup {

	private int code;
	private String label;
	private int level;
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
