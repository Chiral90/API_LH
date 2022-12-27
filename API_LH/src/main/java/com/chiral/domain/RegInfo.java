package com.chiral.domain;

import lombok.Data;

@Data
public class RegInfo {
	private String inuser;
	
	private String indate;
	
	private String regdate;
	
	public String toString() {
		return "inuser : " + this.inuser + ", indate : " + this.indate + ", regdate : " + this.regdate;
	}
}
