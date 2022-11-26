package com.chiral.service;

import java.util.List;

import com.chiral.domain.IngredientVO;
import com.chiral.domain.RegInfo;

public interface IngredientService {

	public List<IngredientVO> getIngredients();

	public IngredientVO selectIngredient(IngredientVO vo);
	
	public Boolean registerIngredient(IngredientVO vo);

	public Boolean deleteIngredient(IngredientVO vo);

	public Boolean updateIngredient(IngredientVO vo);
	
	public Boolean registerCost(IngredientVO vo, RegInfo regInfo);
}
