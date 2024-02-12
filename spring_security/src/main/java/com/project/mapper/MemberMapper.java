package com.project.mapper;

import org.springframework.stereotype.Repository;

import com.project.domain.MemberVO;

@Repository
public interface MemberMapper {

	public MemberVO read(String userid);
}
