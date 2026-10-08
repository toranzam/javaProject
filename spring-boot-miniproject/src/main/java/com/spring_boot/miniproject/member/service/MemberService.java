package com.spring_boot.miniproject.member.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring_boot.miniproject.member.dto.MemberDto;
import com.spring_boot.miniproject.member.dto.MemberJoinDto;
import com.spring_boot.miniproject.member.dto.MemberLoginDto;
import com.spring_boot.miniproject.member.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberMapper memberMapper;
	private final PasswordEncoder passwordEncoder;

	public MemberDto login(MemberLoginDto memberLoginDto) {

		MemberDto foundMember = memberMapper.findByUsername(memberLoginDto.getLoginId());

		if (foundMember == null) {
			return null;
		}

		boolean matched = passwordEncoder.matches(memberLoginDto.getPassword(), foundMember.getPasswordHash());

		/* 패스워드 미스매칭 */
		if (!matched) {
			return null;
		}

		return foundMember;
	}

	@Transactional
	public boolean join(MemberJoinDto memberJoinDto) {

		boolean usernameExists = memberMapper.existByUsername(memberJoinDto.getLoginId());

		if (usernameExists) {
			return false;
		}
		
		String passwordHash = passwordEncoder.encode(memberJoinDto.getPassword());
		memberJoinDto.setPassword(passwordHash);
		
		memberMapper.saveMember(memberJoinDto);
		
		memberMapper.saveAddress(memberJoinDto);

		return true;
	}

}
