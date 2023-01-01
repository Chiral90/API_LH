package com.chiral.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.chiral.domain.UserVO;
import com.chiral.mapper.SecurityMapper;

import com.chiral.jwt.JwtUtil;

@Service
@Primary
public class SecurityServiceImpl implements SecurityService {
	
	final static Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);
	
	@Autowired
	private SecurityMapper m;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	public UserVO logIn(UserVO vo) {
		logger.info("SecurityService - login...");
		int tier = -1;
		try {
			tier = m.logIn(vo);
			logger.info(vo.getId() + " tier : " + tier);
			if (tier > 0) {
				String authToken = jwtUtil.createAuthToken(vo.getId());
				vo.setAuthToken(authToken);
			}
			return vo;
		}
		catch (Exception e) {
			logger.info(e.getMessage());
			return null;
		}
	}
}
