package com.chiral.mapper;

import java.util.List;

import com.chiral.domain.IngredientVO;
import com.chiral.domain.RegInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IngredientMapper {
	
	public List<IngredientVO> getIngredients();
	
	public IngredientVO selectIngredient(IngredientVO vo);
	
	public Boolean registerIngredient(IngredientVO vo);
	
	public Boolean deleteIngredient(IngredientVO vo);
	
	public Boolean updateIngredient(IngredientVO vo);
	
	public Boolean registerCost(@Param("ingr")IngredientVO vo, @Param("ri")RegInfo regInfo);
	
	public Boolean updateDailyUnitprice(RegInfo regInfo);
}
