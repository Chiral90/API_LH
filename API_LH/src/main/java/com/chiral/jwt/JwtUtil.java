package com.chiral.jwt;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JwtUtil {
	
	//application.properties에 입력된 값을 주입
	@Value("${jwt.sc}")
	private String sc;
	
	@Value("${jwt.expmin}")
	private Long expmin;
	
	public String createAuthToken(String id) {
		return create(id, "authToken", expmin);
	}
	/**
	 * 로그인 성공 시 사용자 정보를 기반으로 JWT를 생성해서 반환
	 * JWT = Header + Payload + Signature
	 * @param id
	 * @param subject
	 * @param expireMin
	 * @return
	 */
	public String create(String id, String subject, long expireMin) {
		final JwtBuilder builder = Jwts.builder();
		builder.setSubject(subject)
			.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * expireMin));
		
		if (id != null) {
			builder.claim("user", id);
		}
		
		builder.signWith(SignatureAlgorithm.HS256, sc.getBytes());
		
		final String jwt = builder.compact();
		log.debug("토큰 발행: {}", jwt);
		
		return jwt;
	}
	
	public Map<String, Object> checkAndGetClaims(String jwt) {
		Jws<Claims> claims = Jwts.parser().setSigningKey(sc.getBytes()).parseClaimsJws(jwt);
		log.trace("claims: {}", claims);
		
		return claims.getBody();
	}
}
