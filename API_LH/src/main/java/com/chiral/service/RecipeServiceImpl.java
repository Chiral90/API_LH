package com.chiral.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.chiral.controller.RecipeController;
import com.chiral.domain.RecipeVO;
import com.chiral.domain.RegInfo;
import com.chiral.mapper.RecipeMapper;

public class RecipeServiceImpl implements RecipeService {
	final static Logger logger = LoggerFactory.getLogger(RecipeController.class);
	
	@Autowired
	private RecipeMapper recipeMapper;
	
	public List<RecipeVO> getRecipes() {
		List<RecipeVO> result = null;
		
		try {
			result = recipeMapper.getRecipes();
		}
		catch (Exception e) {
			
		}
		
		return result;
	}

	public RecipeVO selectRecipe(RecipeVO vo, RegInfo regInfo) {
		RecipeVO result = null;
		try {
			result = recipeMapper.selectRecipe(vo, regInfo);
		}
		catch (Exception e) {
			
		}
		
		return result;
	}
	
	public Boolean registerRecipe(RecipeVO vo, RegInfo regInfo) {
		Boolean result = false;
		try {
			result = recipeMapper.registerRecipe(vo, regInfo);
		}
		catch (Exception e) {
			
		}
		
		return result;
	}

	public Boolean deleteRecipe(RecipeVO vo, RegInfo regInfo) {
		Boolean result = false;
		try {
			result = recipeMapper.deleteRecipe(vo, regInfo);
		}
		catch (Exception e) {
			
		}
		
		return result;
	}

	public Boolean updateRecipe(RecipeVO vo, RegInfo regInfo) {
		Boolean result = false;
		try {
			result = recipeMapper.updateRecipe(vo, regInfo);
		}
		catch (Exception e) {
			
		}
		
		return result;
	}
}
