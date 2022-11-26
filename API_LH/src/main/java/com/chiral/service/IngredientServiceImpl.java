package com.chiral.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

import com.chiral.controller.IngredientController;
import com.chiral.domain.IngredientVO;
import com.chiral.domain.RegInfo;
import com.chiral.mapper.IngredientMapper;
import com.chiral.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Primary
public class IngredientServiceImpl implements IngredientService {
	final static Logger logger = LoggerFactory.getLogger(IngredientController.class);
	
	@Autowired
	private IngredientMapper ingrMapper;
	
	public List<IngredientVO> getIngredients() {

		logger.info("service stage - getIngredients");
		
		List<IngredientVO> result = null;
		
		try {
			logger.info("mapper");
			result = ingrMapper.getIngredients();
		}
		catch (Exception e) {
			logger.info(e.toString() + " Exception : " + e.getMessage());
		}
		
		logger.info("count : " + result.size());
		logger.info("first name : ");
		
		return result;
		
	}

	public IngredientVO selectIngredient(IngredientVO vo) {
		
		IngredientVO result = null;
		
		try {
			result = ingrMapper.selectIngredient(vo);
		}
		catch (Exception e) {
			logger.info(
					result == null ?
							"result is null @Service"
							: "Exception : " + e.toString()
			);
		}
		
		return result;
		
	}
	public Boolean registerIngredient(IngredientVO vo) {
		logger.info("service stage - registerIngredient : ");
		Boolean result = null;
		try {
			result = ingrMapper.registerIngredient(vo);
		}
		catch (Exception e) {
			logger.info("Exception : " + e.toString());
		}
		return result;
	}

	public Boolean deleteIngredient(IngredientVO vo) {
		logger.info("service stage - deleteIngredient : ");
		Boolean result = null;
		try {
			result = ingrMapper.deleteIngredient(vo);
		}
		catch (Exception e) {
			logger.info("Exception : " + e.toString());
		}
		return result;
	}

	public Boolean updateIngredient(IngredientVO vo) {
		logger.info("service stage - updateIngredient : ");
		Boolean result = null;
		try {
			result = ingrMapper.updateIngredient(vo);
		}
		catch (Exception e) {
			logger.info("Exception : " + e.toString());
		}
		return result;
	}

	public Boolean registerCost(IngredientVO vo, RegInfo regInfo) {
		logger.info("service stage - registerCost : ");
		Boolean result = null;
		try {
			result = ingrMapper.registerCost(vo, regInfo);
		}
		catch (Exception e) {
			logger.info("Exception : " + e.toString());
		}
		return result;
	}
}
