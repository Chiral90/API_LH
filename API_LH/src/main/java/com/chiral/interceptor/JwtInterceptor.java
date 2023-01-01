package com.chiral.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JwtInterceptor implements HandlerInterceptor {
	
	//@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (request.getMethod().equals("OPTIONS")) {
			return true;
		}
		
		String authToken = request.getHeader("jwt-auth-token");
		log.debug("경로: {}, 토큰: {}", request.getServletPath(), authToken);
		
		if (authToken != null) {
			//유효한 토큰이면 진행, 그렇지 않으면 예외 발생
			return true;
		} else {
			throw new RuntimeException("Invalid Token...");
		}
	}
}
