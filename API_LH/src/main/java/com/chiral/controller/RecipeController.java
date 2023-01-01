package com.chiral.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chiral.ApiLhApplication;
import com.chiral.domain.RecipeVO;
import com.chiral.domain.RegInfo;
import com.chiral.service.RecipeService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@RestController
@RequestMapping("/recipe/*")
public class RecipeController {
	@Autowired
	private RecipeService recipeServce;

	final static Logger logger = LoggerFactory.getLogger(RecipeController.class);
     
    String resultmsg="";
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<RecipeVO> getAllRecipes(HttpServletRequest request) throws Exception {
    	List<RecipeVO> result = recipeServce.getRecipes();
         
        logger.info("getAll");
        
        return result;
    }

    @RequestMapping(value="/select",method=RequestMethod.POST)
    public RecipeVO selectRecipe(HttpServletRequest request, @RequestBody RecipeVO vo) throws Exception {
    	logger.info("Recipe Controller Stage : selectRecipe");
    	
    	RecipeVO result = recipeServce.selectRecipe(vo);
        
        return result;
    }
    
    @RequestMapping(value="/registerInfo",method=RequestMethod.POST)
    public Boolean registerInfo(HttpServletRequest request, @RequestBody Map<String, Object> requestBody) throws Exception {

    	ObjectMapper converter = new ObjectMapper();
    	
    	RecipeVO vo;
    	RegInfo regInfo;
		
    	vo = converter.convertValue(requestBody.get("Recipe")
    			, new TypeReference<RecipeVO>() {});
    	regInfo = converter.convertValue(requestBody.get("RegInfo")
    			, new TypeReference<RegInfo>() {});

		logger.info("Recipe Controller Stage");
		if (vo != null && regInfo != null)
		{
			logger.info("Recipe : " + vo.getRecipe());
			logger.info("RegInfo : " + regInfo.toString());
		}
		else
		{
			logger.info("both are null");
		}
		
    	Boolean result = recipeServce.registerRecipe(vo, regInfo);
         
        logger.info("register : " + (result ? "success" : "fail"));
        
        return result;
    }

    @RequestMapping(value="/delete",method=RequestMethod.POST)
    public Boolean deleteRecipe(HttpServletRequest request, @RequestBody RecipeVO vo) throws Exception {
    	Boolean result = recipeServce.deleteRecipe(vo);
         
        logger.info("delete : " + (result ? "success" : "fail"));
        
        return result;
    }
    

    @RequestMapping(value="/update",method=RequestMethod.POST)
    public Boolean updateRecipe(HttpServletRequest request, @RequestBody Map<String, Object> requestBody) throws Exception {

    	ObjectMapper converter = new ObjectMapper();
    	
    	RecipeVO vo;
    	RegInfo regInfo;
		
    	vo = converter.convertValue(requestBody.get("Recipe")
    			, new TypeReference<RecipeVO>() {});
    	regInfo = converter.convertValue(requestBody.get("RegInfo")
    			, new TypeReference<RegInfo>() {});

    	//수정 시 regdate 안건드리게 수정 필요(2022.12.27)
		logger.info("Recipe Controller Stage");
		if (vo != null && regInfo != null)
		{
			logger.info("Recipe : " + vo.getRecipe());
			logger.info("RegInfo : " + regInfo.toString());
		}
		else
		{
			logger.info("both are null");
		}
		
    	Boolean result = recipeServce.updateRecipe(vo, regInfo);
         
        logger.info("update : " + (result ? "success" : "fail"));
        
        return result;
    }
}
