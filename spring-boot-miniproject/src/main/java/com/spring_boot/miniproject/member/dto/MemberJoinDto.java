package com.spring_boot.miniproject.member.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MemberJoinDto {
	private Long memberId;
	
	@NotBlank(message = "아이디를 입력해주세요.")
	private String loginId;
	@NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;
	@NotBlank(message = "비밀번호 확인을 입력해주세요.")
    private String passwordCheck;
	@NotBlank(message = "이름을 입력해주세요.")
    private String memberName;
	@NotBlank(message = "이메일을 입력해주세요.")
    private String email;
	@NotBlank(message = "휴대폰 번호를 입력해주세요.")
    private String phone;

    @NotBlank(message = "주소 검색으로 우편번호를 입력해주세요.")
    private String postalCode;
    @NotBlank(message = "주소 검색으로 주소를 입력해주세요.")
    private String addressLine1;
    @NotBlank(message = "주소 상세를 입력해주세요.")
    private String addressLine2;
    
    

}
