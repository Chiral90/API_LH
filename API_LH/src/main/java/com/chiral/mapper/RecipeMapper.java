package com.chiral.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chiral.domain.RecipeVO;
import com.chiral.domain.RegInfo;

@Mapper
public interface RecipeMapper {
	public List<RecipeVO> getRecipes();

	public RecipeVO selectRecipe(RecipeVO vo, RegInfo regInfo);
	
	public Boolean registerRecipe(RecipeVO vo, RegInfo regInfo);

	public Boolean deleteRecipe(RecipeVO vo, RegInfo regInfo);

	public Boolean updateRecipe(RecipeVO vo, RegInfo regInfo);
}
