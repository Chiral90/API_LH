package com.chiral.domain;

import java.util.List;

import lombok.Data;

@Data
public class UserVO {
	private String id;
	private String pw;
	private String regdate;
	
	public String getPW() {
		return pw;
	}
}
