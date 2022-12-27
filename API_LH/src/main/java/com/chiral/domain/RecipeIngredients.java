package com.chiral.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

//@Data
public class RecipeIngredients {
	@JsonProperty
	String ingrCode;
	@JsonProperty
	String ingrName;
	@JsonProperty
	float quantity;
	
	@JsonIgnore
	public String getIngrCode() {
		return this.ingrCode;
	}
	@JsonIgnore
	public float getQuantity() {
		return this.quantity;
	}
}
