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
import com.chiral.domain.IngredientVO;
import com.chiral.domain.RegInfo;
import com.chiral.service.IngredientService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@RestController
@RequestMapping("/ingredient/*")
public class IngredientController {
	
	@Autowired
    private IngredientService ingrService;
	
	final static Logger logger = LoggerFactory.getLogger(ApiLhApplication.class);
     
    String resultmsg="";
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<IngredientVO> getAllIngredients(HttpServletRequest request) throws Exception {
    	List<IngredientVO> result = ingrService.getIngredients();
         
        logger.info("getAll");
        
        return result;
    }

    @RequestMapping(value="/select",method=RequestMethod.POST)
    public IngredientVO selectIngredient(HttpServletRequest request, @RequestBody IngredientVO vo) throws Exception {
    	
    	IngredientVO result = ingrService.selectIngredient(vo);
        
        return result;
    }
    
    @RequestMapping(value="/register",method=RequestMethod.POST)
    public Boolean registerIngredient(HttpServletRequest request, @RequestBody IngredientVO vo) throws Exception {
    	
    	Boolean result = ingrService.registerIngredient(vo);
         
        logger.info("register : " + (result ? "success" : "fail"));
        
        return result;
    }

    @RequestMapping(value="/delete",method=RequestMethod.POST)
    public Boolean deleteIngredient(HttpServletRequest request, @RequestBody IngredientVO vo) throws Exception {
    	
    	Boolean result = ingrService.deleteIngredient(vo);
         
        logger.info("delete : " + (result ? "success" : "fail"));
        
        return result;
    }
    

    @RequestMapping(value="/update",method=RequestMethod.POST)
    public Boolean updateIngredient(HttpServletRequest request, @RequestBody IngredientVO vo) throws Exception {
    	
    	Boolean result = ingrService.updateIngredient(vo);
         
        logger.info("update : " + (result ? "success" : "fail"));
        
        return result;
    }

    @RequestMapping(value="/registerCost",method=RequestMethod.POST)
    public Boolean registerCost(HttpServletRequest request, @RequestBody Map<String, Object> requestBody) throws Exception {
    	
    	ObjectMapper converter = new ObjectMapper();
    	
    	IngredientVO vo;
    	RegInfo regInfo;

    	vo = converter.convertValue(requestBody.get("Ingredient")
    			, new TypeReference<IngredientVO>() {});
    	regInfo = converter.convertValue(requestBody.get("RegInfo")
    			, new TypeReference<RegInfo>() {});
    	
    	Boolean result = ingrService.registerCost(vo, regInfo);
         
        logger.info("register : " + (result ? "success" : "fail"));
        
        return result;
    }
}
