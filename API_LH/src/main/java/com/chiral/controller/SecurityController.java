package com.chiral.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chiral.domain.UserVO;
import com.chiral.jwt.JwtUtil;
import com.chiral.service.SecurityService;

@SpringBootApplication
@RestController
@RequestMapping("/security/*")
public class SecurityController {
	
	final static Logger logger = LoggerFactory.getLogger(SecurityController.class);
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> logIn
		(@RequestBody UserVO vo, HttpServletResponse res, HttpServletRequest req) throws Exception {
		
		UserVO resultVO = null;
		Map<String, Object> resultMap = new HashMap<String, Object>();

		logger.info("SecurityController login...");
		
		try {
			resultVO = securityService.logIn(vo);
			resultMap.put("jwt-auth-token", resultVO.getAuthToken());
			
			Map<String, Object> info = jwtUtil.checkAndGetClaims(resultVO.getAuthToken());
			resultMap.putAll(info);
			
			return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			logger.info(e.getMessage());
			return null;
		}
	}
	
	/*
	//token 발행
	@RequestMapping(value="/generate/token",method=RequestMethod.GET)
	public Map<String, Object> generateToken(@RequestParam String subject) {
		logger.info(subject);
		
		String token = securityService.createToken(subject, 1000 * 60 * 60);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userid", subject);
		map.put("token", token);
		return map;
	}
	
	//token 요청(식별)
	//@GetMapping("/get/subject")
	@RequestMapping(value="/get/subject",method=RequestMethod.GET)
	public String getSubject(@RequestParam String token) {
		String subject = securityService.getSubject(token);
		return subject;
	}
	*/
}
