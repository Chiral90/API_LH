package com.chiral.domain;

import java.util.List;

import lombok.Data;

@Data
public class RecipeVO {
	private String code;
	
	private String name;
	
	private List<Sequence> seq;
	
	private List<Ingredients> ingrs;
}

class Sequence {
	int sequence;
	
	String detail;
}

class Ingredients {
	String code_ingr;
	
	float quantity;
}
