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

	final static Logger logger = LoggerFactory.getLogger(ApiLhApplication.class);
     
    String resultmsg="";
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<RecipeVO> getAllIngredients(HttpServletRequest request) throws Exception {
    	List<RecipeVO> result = recipeServce.getRecipes();
         
        logger.info("getAll");
        
        return result;
    }

    @RequestMapping(value="/select",method=RequestMethod.POST)
    public RecipeVO selectRecipe(HttpServletRequest request, @RequestBody Map<String, Object> requestBody) throws Exception {

    	ObjectMapper converter = new ObjectMapper();
    	
    	RecipeVO vo;
    	RegInfo regInfo;

    	vo = converter.convertValue(requestBody.get("Recipe")
    			, new TypeReference<RecipeVO>() {});
    	regInfo = converter.convertValue(requestBody.get("RegInfo")
    			, new TypeReference<RegInfo>() {});
    	RecipeVO result = recipeServce.selectRecipe(vo, regInfo);
        
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
    	Boolean result = recipeServce.registerRecipe(vo, regInfo);
         
        logger.info("register : " + (result ? "success" : "fail"));
        
        return result;
    }

    @RequestMapping(value="/delete",method=RequestMethod.POST)
    public Boolean deleteIngredient(HttpServletRequest request, @RequestBody Map<String, Object> requestBody) throws Exception {

    	ObjectMapper converter = new ObjectMapper();
    	
    	RecipeVO vo;
    	RegInfo regInfo;

    	vo = converter.convertValue(requestBody.get("Recipe")
    			, new TypeReference<RecipeVO>() {});
    	regInfo = converter.convertValue(requestBody.get("RegInfo")
    			, new TypeReference<RegInfo>() {});
    	Boolean result = recipeServce.deleteRecipe(vo, regInfo);
         
        logger.info("delete : " + (result ? "success" : "fail"));
        
        return result;
    }
    

    @RequestMapping(value="/update",method=RequestMethod.POST)
    public Boolean updateIngredient(HttpServletRequest request, @RequestBody Map<String, Object> requestBody) throws Exception {

    	ObjectMapper converter = new ObjectMapper();
    	
    	RecipeVO vo;
    	RegInfo regInfo;

    	vo = converter.convertValue(requestBody.get("Recipe")
    			, new TypeReference<RecipeVO>() {});
    	regInfo = converter.convertValue(requestBody.get("RegInfo")
    			, new TypeReference<RegInfo>() {});
    	
    	Boolean result = recipeServce.updateRecipe(vo, regInfo);
         
        logger.info("update : " + (result ? "success" : "fail"));
        
        return result;
    }
}
