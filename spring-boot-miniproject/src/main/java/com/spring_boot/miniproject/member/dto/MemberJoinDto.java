package com.spring_boot.miniproject.member.dto;

import lombok.Data;

@Data
public class MemberJoinDto {
	private String loginId;
    private String password;
    private String passwordCheck;
    private String memberName;
    private String email;   
    private String phone;

    private String postalCode;
    private String addressLine1;
    private String addressLine2;

}
