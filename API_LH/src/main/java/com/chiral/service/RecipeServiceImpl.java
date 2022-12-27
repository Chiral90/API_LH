package com.chiral.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.chiral.controller.RecipeController;
import com.chiral.domain.RecipeIngredients;
import com.chiral.domain.RecipeVO;
import com.chiral.domain.RegInfo;
import com.chiral.domain.RecipeSequence;
import com.chiral.mapper.RecipeMapper;

@Service
@Primary
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

	public RecipeVO selectRecipe(RecipeVO vo) {
		
		logger.info("Recipe Service Stage : " + vo.getCode());
		
		RecipeVO result = null;
		List<RecipeSequence> seq = null;
		List<RecipeIngredients> ingrs = null;
		try {
			result = recipeMapper.selectRecipe(vo);
			seq = recipeMapper.selectRecipeSeq(vo);
			logger.info("seq size : " + seq.size());
			ingrs = recipeMapper.selectRecipeIngrs(vo);
			logger.info("ingrs size : " + ingrs.size());
			
			result.setSeq(seq);
			result.setIngrs(ingrs);
		}
		catch (Exception e) {
			logger.info(e.getMessage());
		}
		
		return result;
	}
	
	public Boolean registerRecipe(RecipeVO vo, RegInfo regInfo) {
		Boolean result = false;
		try {
			logger.info("Recipe Service Stage : " + vo.getRecipe());
			logger.info("Recipe Service Stage : " + regInfo.toString());
			result = recipeMapper.registerRecipe(vo, regInfo);
			
			if (vo.getSeqCnt() > 0) {
				List<RecipeSequence> sequences = vo.getSeq();
				for (int i = 0; i < vo.getSeqCnt(); i++) {
					RecipeSequence rs = sequences.get(i);
					int seq = rs.getSequence();
					String detail = rs.getDetail();
					result = recipeMapper.registerSeq(vo.getCode(), seq, detail, regInfo);
				}
			}
			
			if (vo.getIngrsCnt() > 0) {
				List<RecipeIngredients> ingredients = vo.getIngrs();
				for (int i = 0; i < vo.getIngrsCnt(); i++) {
					RecipeIngredients ri = ingredients.get(i);
					String ingrCode = ri.getIngrCode();
					float quantity = ri.getQuantity();
					result = recipeMapper.registerIngrs(vo.getCode(), ingrCode, quantity, regInfo);
				}
			}
		}
		catch (Exception e) {
			logger.info(e.getMessage());
		}
		
		return result;
	}

	public Boolean deleteRecipe(RecipeVO vo) {
		Boolean result = false;
		try {
			result = recipeMapper.deleteRecipeSeq(vo);
			result = recipeMapper.deleteRecipeIngrs(vo);
			result = recipeMapper.deleteRecipe(vo);
		}
		catch (Exception e) {
			
		}
		
		return result;
	}

	public Boolean updateRecipe(RecipeVO vo, RegInfo regInfo) {
		Boolean result = false;
		try {
			logger.info("Recipe Service Stage : " + vo.getRecipe());
			logger.info("Recipe Service Stage : " + regInfo.toString());
			result = recipeMapper.updateRecipe(vo, regInfo);
			
			if (vo.getSeqCnt() > 0) {
				List<RecipeSequence> sequences = vo.getSeq();
				for (int i = 0; i < vo.getSeqCnt(); i++) {
					RecipeSequence rs = sequences.get(i);
					int seq = rs.getSequence();
					String detail = rs.getDetail();
					result = recipeMapper.updateRecipeSeq(vo.getCode(), seq, detail, regInfo);
				}
			}
			
			if (vo.getIngrsCnt() > 0) {
				List<RecipeIngredients> ingredients = vo.getIngrs();
				for (int i = 0; i < vo.getIngrsCnt(); i++) {
					RecipeIngredients ri = ingredients.get(i);
					String ingrCode = ri.getIngrCode();
					float quantity = ri.getQuantity();
					result = recipeMapper.updateRecipeIngrs(vo.getCode(), ingrCode, quantity, regInfo);
				}
			}
		}
		catch (Exception e) {
			logger.info(e.getMessage());
		}
		
		return result;
	}
}
