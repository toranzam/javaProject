package com.spring_boot.miniproject.member.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MemberLoginDto {
	@NotBlank(message = "아이디를 입력해주세요.")
	private String loginId;
	@NotBlank(message = "비밀번호를 입력해주세요.")
	private String password;
	
	
}
