package com.spring_boot.miniproject.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping("/login") 
	public String login() {
		return "member/login";
		
	}
	
	@GetMapping("/join")
	public String signUp() {
		return "member/join";		
	}

}
