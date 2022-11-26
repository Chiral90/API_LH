package com.chiral.service;

import java.util.List;

import com.chiral.domain.RecipeVO;
import com.chiral.domain.RegInfo;

public interface RecipeService {
	public List<RecipeVO> getRecipes();

	public RecipeVO selectRecipe(RecipeVO vo, RegInfo regInfo);
	
	public Boolean registerRecipe(RecipeVO vo, RegInfo regInfo);

	public Boolean deleteRecipe(RecipeVO vo, RegInfo regInfo);

	public Boolean updateRecipe(RecipeVO vo, RegInfo regInfo);
}
