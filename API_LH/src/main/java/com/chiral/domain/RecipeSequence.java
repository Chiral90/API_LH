package com.chiral.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

//@Data
public class RecipeSequence {
	@JsonProperty
	int sequence;
	@JsonProperty
	String detail;
	
	@JsonIgnore
	public int getSequence() {
		return this.sequence;
	}
	@JsonIgnore
	public String getDetail() {
		return this.detail;
	}
}
