package com.chiral.domain;

import lombok.Data;

@Data
public class IngredientVO {
	public String code;
	
	private String name;
	
	private String class_sup = "";
	
	private String class_sub = "";
	
	private String unit_sup = "";
	
	private String unit_sub = "";
	
	public float price = 0;
	
	private float unit_per_purchase = 0;
}