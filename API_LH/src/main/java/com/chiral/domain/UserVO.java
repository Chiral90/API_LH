package com.chiral.domain;

import lombok.Data;

@Data
public class UserVO {
	private String id;
	private String pw;
	private int tier;
	private String regdate;
	
	private String authToken;
	private String refreshToken;
}
