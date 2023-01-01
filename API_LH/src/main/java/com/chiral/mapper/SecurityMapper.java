package com.chiral.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.chiral.domain.UserVO;

@Mapper
public interface SecurityMapper {
	public int logIn(UserVO vo);
}
