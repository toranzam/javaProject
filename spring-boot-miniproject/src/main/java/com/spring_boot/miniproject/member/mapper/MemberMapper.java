package com.spring_boot.miniproject.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.spring_boot.miniproject.member.dto.MemberDto;
import com.spring_boot.miniproject.member.dto.MemberJoinDto;

@Mapper
public interface MemberMapper {
	
	MemberDto findByUsername(@Param("loginId") String loginId);
	
	boolean existByUsername(@Param("loginId")String loginId);
	
	void saveMember(MemberJoinDto memberJoinDto);

}
