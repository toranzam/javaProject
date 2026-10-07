package com.spring_boot.miniproject.member.dto;

import java.time.OffsetDateTime;

import lombok.Data;
import lombok.Getter;

@Data
public class MemberDto {
    private Long memberId;
    private String loginId;
    private String passwordHash;
    private String memberName;
    private String email;
    private String phone;
    private String memberRole;
    private String memberStatus;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime lastLoginAt;
}
