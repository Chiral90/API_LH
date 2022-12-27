package com.chiral.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.chiral.domain.RecipeIngredients;
import com.chiral.domain.RecipeSequence;
import com.chiral.domain.RecipeVO;
import com.chiral.domain.RegInfo;

@Mapper
public interface RecipeMapper {
	public List<RecipeVO> getRecipes();

	public RecipeVO selectRecipe(RecipeVO vo);
	
	public List<RecipeSequence> selectRecipeSeq(RecipeVO vo);
	
	public List<RecipeIngredients> selectRecipeIngrs(RecipeVO vo);
	
	public Boolean registerRecipe(@Param("vo")RecipeVO vo, @Param("regInfo")RegInfo regInfo);
	
	public Boolean registerSeq(@Param("code")String code, @Param("sequence")int sequence,
			@Param("detail")String detail, @Param("regInfo")RegInfo regInfo);

	public Boolean registerIngrs(@Param("code")String code, @Param("ingrCode")String ingrCode,
			@Param("quantity")float quantity, @Param("regInfo")RegInfo regInfo);

	public Boolean deleteRecipe(RecipeVO vo);
	
	public Boolean deleteRecipeSeq(RecipeVO vo);
	
	public Boolean deleteRecipeIngrs(RecipeVO vo);

	public Boolean updateRecipe(@Param("vo")RecipeVO vo, @Param("regInfo")RegInfo regInfo);
	
	public Boolean updateRecipeSeq(@Param("code")String code, @Param("sequence")int seq,
			@Param("detail")String detail, @Param("regInfo")RegInfo regInfo);
	
	public Boolean updateRecipeIngrs(@Param("code")String code, @Param("ingrCode")String ingrCode, 
			@Param("quantity")float quantity, @Param("regInfo")RegInfo regInfo);
}
