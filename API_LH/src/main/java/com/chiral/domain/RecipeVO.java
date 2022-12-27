package com.chiral.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RecipeVO {
	@JsonProperty
	private String code;
	@JsonProperty
	private String name;
	@JsonProperty
	private List<RecipeSequence> seq;
	@JsonProperty
	private List<RecipeIngredients> ingrs;
	
	@JsonIgnore
	public String getRecipe() {
		return "code : " + this.code + " & name : " + this.name;
	}
	@JsonIgnore
	public int getSeqCnt() {
		if (this.seq != null)
			return this.seq.size();
		else
			return 0;
	}
	
	@JsonIgnore
	public int getIngrsCnt() {
		if (this.ingrs != null)
			return this.ingrs.size();
		else
			return 0;
	}
}
